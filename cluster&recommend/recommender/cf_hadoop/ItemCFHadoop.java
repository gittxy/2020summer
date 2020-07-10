package com.recommender.cf_hadoop;

import com.paradeto.recommend.Recommend;
import com.utils.HdfsUtil;
import org.apache.hadoop.mapred.JobConf;
import org.apache.mahout.cf.taste.common.Refreshable;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.hadoop.item.RecommenderJob;
import org.apache.mahout.cf.taste.impl.recommender.AbstractRecommender;
import org.apache.mahout.cf.taste.impl.recommender.GenericItemBasedRecommender;
import org.apache.mahout.cf.taste.recommender.IDRescorer;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 基于Hadoop 分布式执行，itemCF推荐算法;
 * <p>
 * RecommenderJob 的输入也是userID, itemID,preferencevalue格式的。
 *
 * @author Lenovo
 */
public class ItemCFHadoop {

    private static final String HDFS = "hdfs://ecs-hadoop-master:9000/";

    public static void main(String[] args) throws Exception {
        // String localFile = ItemCFHadoop.class.getClassLoader()
        // .getResource("resources/datafile/item.csv")
        // .getFile();
        System.out.println("Item");
        String localFile = "/root/BookShopBI/temp/recommend/recommend_data.csv";
        String inPath = HDFS + "/user/hdfs/in/";
        String inFile = inPath + "recommend_data.csv";
//        String inPath = HDFS + "/user/hdfs/itemCF/dc";
//        String inFile = inPath + "/part-r-00000";
        String outPath = HDFS + "/user/hdfs/result/";
        String outFile = outPath + "part-r-00000";
        String tmpPath = HDFS + "/user/hdfs/temp/" + System.currentTimeMillis();
        //String userIdPath = HDFS + "/user/hdfs/itemCF/userIds.dat";

        /*String localFile = "/root/bx_ratings.csv";
        String inPath = HDFS + "/user/hdfs/itemCF/";
        String inFile = inPath + "bx_ratings.csv";
//        String inPath = HDFS + "/user/hdfs/itemCF/dc";
//        String inFile = inPath + "/part-r-00000";
        String outPath = HDFS + "/user/hdfs/itemCF/result/";
        String outFile = outPath + "part-r-00000";
        String tmpPath = HDFS + "/tmp/" + System.currentTimeMillis();
        String userIdPath = HDFS + "/user/hdfs/itemCF/userIds.dat";*/

        JobConf conf = config();
        HdfsUtil hdfs = new HdfsUtil(HDFS, conf);
        hdfs.rmr(inPath);
        hdfs.rmr(outPath);
        hdfs.mkdirs(inPath);
        //hdfs.mkdirs(outPath);
        hdfs.mkdirs(tmpPath);
        hdfs.copyFile(localFile, inPath);
        hdfs.ls(inPath);
        hdfs.cat(inFile);
        //hdfs.createFile(outFile,outPath);

        StringBuilder sb = new StringBuilder();
        sb.append("--input ").append(inPath);
        sb.append(" --output ").append(outPath);
        sb.append(" --booleanData true");
        sb.append(" --numRecommendations 12");
        sb.append(" --similarityClassname org.apache.mahout.math.hadoop.similarity.cooccurrence.measures.EuclideanDistanceSimilarity");
        sb.append(" --tempDir ").append(tmpPath);
        //sb.append("--usersFile ").append(userIdPath);
        System.out.println(sb.toString());
        args = sb.toString().split(" ");

        System.out.println("look1："+args[0]);
        System.out.println("look2："+args[1]);
        System.out.println("look3："+args[2]);
        System.out.println("look4："+args[3]);
        System.out.println("look5："+args[4]);
        System.out.println("look6："+args[5]);

        RecommenderJob job = new RecommenderJob();
        job.setConf(conf);
        job.run(args);

        hdfs.cat(inFile);
        hdfs.cat(outFile);
        hdfs.download(outFile,"/root/BookShopBI/temp/recommend");
    }

    public static JobConf config() {
        JobConf conf = new JobConf(ItemCFHadoop.class);
        conf.set("fs.hdfs.impl","org.apache.hadoop.hdfs.DistributedFileSystem");
        conf.setJobName("ItemCFHadoopDAO");
        conf.addResource("classpath:/hadoop/core-site.xml");
        conf.addResource("classpath:/hadoop/hdfs-site.xml");
        conf.addResource("classpath:/hadoop/mapred-site.xml");
        return conf;
    }
}
/*
 * 参数说明:
 *
 * --input(path) : 存储用户偏好数据的目录，该目录下可以包含一个或多个存储用户偏好数据的文本文件；
 *
 * --output(path) :结算结果的输出目录;
 *
 * --numRecommendations (integer) : 为每个用户推荐的item数量，默认为10;
 *
 * --usersFile(path) : 指定一个包含了一个或多个存储userID的文件路径，仅为该路径下所有文件包含的userID做推荐计算(该选项可选);
 *
 * --itemsFile (path) :指定一个包含了一个或多个存储itemID的文件路径，仅为该路径下所有文件包含的itemID做推荐计算(该选项可选);
 *
 * --filterFile (path) :指定一个路径，该路径下的文件包含了[userID,itemID]值对，userID和itemID用逗号分隔。计算结果将不会为user推荐[userID,itemID] 值对中包含的item (该选项可选);
 *
 * --booleanData (boolean) :如果输入数据不包含偏好数值，则将该参数设置为true，默认为false;
 *
 * --maxPrefsPerUser (integer) :在最后计算推荐结果的阶段，针对每一个user使用的偏好数据的最大数量，默认为10;
 *
 * --minPrefsPerUser (integer) :在相似度计算中，忽略所有偏好数据量少于该值的用户，默认为1;
 *
 * --maxSimilaritiesPerItem (integer) :针对每个item的相似度最大值，默认为100;
 *
 * --maxPrefsPerUserInItemSimilarity (integer):在item相似度计算阶段，针对每个用户考虑的偏好数据最大数量，默认为1000;
 *
 * --similarityClassname (classname) :向量相似度计算类 outputPathForSimilarityMatrix：SimilarityMatrix输出目录;
 *
 * --randomSeed：随机种子;
 *
 * --sequencefileOutput ：序列文件输出路径;
 *
 * --tempDir (path) :存储临时文件的目录，默认为当前用户的home目录下的temp目录;
 *
 * --threshold (double) : 忽略相似度低于该阀值的item对;
 */
