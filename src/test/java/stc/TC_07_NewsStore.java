package stc;

import java.net.MalformedURLException;
import org.stc.pageObjects.android.BannerPage;
import org.stc.pageObjects.android.BaseTest;
import org.stc.pageObjects.android.NewsPage;
import org.testng.annotations.Test;

public class TC_07_NewsStore extends BaseTest {

	@Test
	public void sc_NewsAndStoreVerify() throws MalformedURLException, InterruptedException {

		NewsPage news = new NewsPage(driver);
		news.setNewsOne();
		viewBlogs();
		// news.viewNewsScrollArticle();
		news.setNewsViewAll();
		news.setNewsViewAllFirst();
		viewBlogs();
	}

	private void viewBlogs() throws InterruptedException {
		BannerPage blog = new BannerPage(driver);
		Thread.sleep(8000);
		blog.viewBannerMenu();
		blog.viewStcLogo();
		blog.viewSearch();
		blog.viewShoppingCart();
		blog.viewProfile();
		driver.navigate().back();

	}

}
