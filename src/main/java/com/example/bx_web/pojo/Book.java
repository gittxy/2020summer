package com.example.bx_web.pojo;

import java.sql.Timestamp;

public class Book {
    private Long book_id;
    private Long book_category_id;
    private Long store_id;
    private String name;
    private String outline;
    private String detail;
    private String press;
    private String publish_data;
    private String size;
    private String version;
    private String author;
    private String translator;
    private String isbn;
    private String price;
    private String pages;
    private String catalog;
    private String market_price;
    private String member_price;
    private String deal_mount;
    private String look_mount;
    private String discount;
    private String image_url;
    private Long store_mount;
    private Timestamp store_time;
    private Long is_shelf;
    private String canme;
    private String description;
    private String cata;
    private String content;

    public Book() {
    }

    public Book(Long book_id) {
        this.book_id = book_id;
    }

    public Book(Long book_id, Long book_category_id, Long store_id, String name, String outline, String detail, String press, String publish_data, String size, String version, String author, String translator, String isbn, String price, String pages, String catalog, String market_price, String member_price, String deal_mount, String look_mount, String discount, String image_url, Long store_mount, Timestamp store_time, Long is_shelf, String canme, String description, String cata, String content) {
        this.book_id = book_id;
        this.book_category_id = book_category_id;
        this.store_id = store_id;
        this.name = name;
        this.outline = outline;
        this.detail = detail;
        this.press = press;
        this.publish_data = publish_data;
        this.size = size;
        this.version = version;
        this.author = author;
        this.translator = translator;
        this.isbn = isbn;
        this.price = price;
        this.pages = pages;
        this.catalog = catalog;
        this.market_price = market_price;
        this.member_price = member_price;
        this.deal_mount = deal_mount;
        this.look_mount = look_mount;
        this.discount = discount;
        this.image_url = image_url;
        this.store_mount = store_mount;
        this.store_time = store_time;
        this.is_shelf = is_shelf;
        this.canme = canme;
        this.description = description;
        this.cata = cata;
        this.content = content;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }

    public Long getBook_category_id() {
        return book_category_id;
    }

    public void setBook_category_id(Long book_category_id) {
        this.book_category_id = book_category_id;
    }

    public Long getStore_id() {
        return store_id;
    }

    public void setStore_id(Long store_id) {
        this.store_id = store_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutline() {
        return outline;
    }

    public void setOutline(String outline) {
        this.outline = outline;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPublish_data() {
        return publish_data;
    }

    public void setPublish_data(String publish_data) {
        this.publish_data = publish_data;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getMember_price() {
        return member_price;
    }

    public void setMember_price(String member_price) {
        this.member_price = member_price;
    }

    public String getDeal_mount() {
        return deal_mount;
    }

    public void setDeal_mount(String deal_mount) {
        this.deal_mount = deal_mount;
    }

    public String getLook_mount() {
        return look_mount;
    }

    public void setLook_mount(String look_mount) {
        this.look_mount = look_mount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Long getStore_mount() {
        return store_mount;
    }

    public void setStore_mount(Long store_mount) {
        this.store_mount = store_mount;
    }

    public Timestamp getStore_time() {
        return store_time;
    }

    public void setStore_time(Timestamp store_time) {
        this.store_time = store_time;
    }

    public Long getIs_shelf() {
        return is_shelf;
    }

    public void setIs_shelf(Long is_shelf) {
        this.is_shelf = is_shelf;
    }

    public String getCanme() {
        return canme;
    }

    public void setCanme(String canme) {
        this.canme = canme;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCata() {
        return cata;
    }

    public void setCata(String cata) {
        this.cata = cata;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
