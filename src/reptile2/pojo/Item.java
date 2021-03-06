package reptile2.pojo;

/**
 * 商品实体
 * 
 * @author Administrator
 * 
 */

public class Item {
	// '商品id，同时也是商品编号'

	@Override
	public String toString() {
		return "Item [id=" + id + ",price=" + price + ", title=" + title + ", sellPoint="
				+ sellPoint + ", num=" + num + ", barcode=" + barcode + ", image="
				+ image + ",  cid=" + cid + ", status=" + status + "]";
	}

	private Long id;
	// '商品标题'
	private String title;
	// '商品卖点'

	private String sellPoint;
	// '库存数量'
	private Integer num;
	// '商品条形码'
	private String barcode;
	// '商品图片'
	private String image;
	// '商品价格，单位为：分'
	private Long price;
	// 所属类目，叶子类目'
	private Long cid;
	// '商品状态，1-正常，2-下架，3-删除'
	private Integer status;

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSellPoint() {
		return sellPoint;
	}

	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

}
