package reptile3.download;

import reptile3.domain.Page;

public class DownloadImpl implements Downloadable{
	public Page download(String url) {  
        Page page = new Page();  
        String content=PageUtil.getContent(url);//根据url得到内容  
        page.setContent(content);  
        page.setDataUrl(url);  
        return page;  
    }  
}
