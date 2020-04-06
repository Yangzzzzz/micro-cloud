package cn.ihzgnay.micro.model;

import javax.persistence.*;

public class Product {
    @Id
    @Column(name = "productId")
    private Long productid;

    @Column(name = "productName")
    private String productname;

    @Column(name = "productDesc")
    private String productdesc;

    /**
     * @return productId
     */
    public Long getProductid() {
        return productid;
    }

    /**
     * @param productid
     */
    public void setProductid(Long productid) {
        this.productid = productid;
    }

    /**
     * @return productName
     */
    public String getProductname() {
        return productname;
    }

    /**
     * @param productname
     */
    public void setProductname(String productname) {
        this.productname = productname;
    }

    /**
     * @return productDesc
     */
    public String getProductdesc() {
        return productdesc;
    }

    /**
     * @param productdesc
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }
}