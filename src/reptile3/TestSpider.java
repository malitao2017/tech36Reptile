package reptile3;

import org.junit.Test;

import reptile3.domain.Page;
import reptile3.download.DownloadImpl;
import reptile3.store.StoreImpl;

public class TestSpider {
	@Test   
    public void test1() throws Exception {  
        Spider spider = new Spider();  
          
        //给接口注入实现类  
        spider.setDownloadable(new DownloadImpl());  
        spider.setProcessable(new ProcessImpl());  
        spider.setStoreable(new StoreImpl());  
          
        String url = "http://item.jd.com/1593512.html";  
        Page page = spider.download(url);
        spider.process(page);
        spider.store(page);
  
    }  
}
