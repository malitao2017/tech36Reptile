package reptile3.store;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import reptile3.domain.Page;

public class StoreImpl implements Storeable {

	public void store(Page page) {  
        String dataUrl = page.getDataUrl();  
        String goodid = page.getGoodId();  
        String goodname = page.getGoodName();  
        String picUrl = page.getPicUrl();  
        String price  = page.getPrice();  
          
        Map<String, String> values = page.getParam();  
        String param = values.get("spec");  
          
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String currtime = sdf.format(new Date());  
        MyDBUtils.update(MyDBUtils.INSERT_LOG, goodid,dataUrl,picUrl,goodname,price,param,currtime);  
    }  

}
