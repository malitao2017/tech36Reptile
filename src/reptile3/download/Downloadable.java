package reptile3.download;

import reptile3.domain.Page;

public interface Downloadable {
	Page download(String url);  
}
