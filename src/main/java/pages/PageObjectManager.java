package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;

    public LoginPage loginPage;
    public SignupPage signupPage;
    public FbLoginPage fbLoginPage;
    public FbSignupPage fbSignupPage;
    public SearchPage searchPage;
    public NotificationPage notificationPage;
    public MessagePage messagePage;
    public ProfileEditPage profileEditPage;
    public ProfileSharePage profileSharePage;
    public ShareWithFbPage shareWithFbPage;
    public ShareWithTwitterPage twitterPage;
    public HelpCenterPage helpCenterPage;
    public AboutLinkPage aboutLinkPage;
    public CreateWidgetPage createWidgetPage;
    public PinOptionsPage pinOptionsPage;
    public GetExtensionPage extensionPage;
    public PostOptionsPage postOptionsPage;
    public PostSharePage postSharePage;
    public PostLikePage postLikePage;
    public PostSavePage postSavePage;
    public FollowPage followPage;
    public CommentLikePage commentLikePage;

    public PageObjectManager(WebDriver driver) {
        this.driver =driver;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public SignupPage getSignupPage(){
        signupPage = new SignupPage(driver);
        return signupPage;
    }

    public FbLoginPage getFbLoginPage(){
        fbLoginPage = new FbLoginPage(driver);
        return fbLoginPage;
    }

    public FbSignupPage getFbSignupPage(){
        fbSignupPage = new FbSignupPage(driver);
        return fbSignupPage;
    }

    public SearchPage getSearchPage(){
        searchPage = new SearchPage(driver);
        return searchPage;
    }

    public NotificationPage getNotificationPage(){
        notificationPage = new NotificationPage(driver);
        return notificationPage;
    }

    public MessagePage getMessagePage(){
        messagePage = new MessagePage(driver);
        return messagePage;
    }

    public ProfileEditPage getProfileEditPage(){
        profileEditPage = new ProfileEditPage(driver);
        return profileEditPage;
    }

    public ProfileSharePage getProfileSharePage(){
        profileSharePage = new ProfileSharePage(driver);
        return profileSharePage;
    }

    public ShareWithFbPage getShareWithFbPage(){
        shareWithFbPage = new ShareWithFbPage(driver);
        return shareWithFbPage;
    }

    public ShareWithTwitterPage getTwitterPage(){
        twitterPage = new ShareWithTwitterPage(driver);
        return twitterPage;
    }

    public HelpCenterPage getHelpCenterPage(){
        helpCenterPage = new HelpCenterPage(driver);
        return helpCenterPage;
    }

    public AboutLinkPage getAboutLinkPage(){
        aboutLinkPage = new AboutLinkPage(driver);
        return aboutLinkPage;
    }

    public CreateWidgetPage getCreateWidgetPage(){
        createWidgetPage = new CreateWidgetPage(driver);
        return createWidgetPage;
    }

    public PinOptionsPage getPinOptionsPage(){
        pinOptionsPage = new PinOptionsPage(driver);
        return pinOptionsPage;
    }

    public GetExtensionPage getExtensionPage(){
        extensionPage = new GetExtensionPage(driver);
        return extensionPage;
    }

    public PostOptionsPage getPostOptionsPage(){
        postOptionsPage = new PostOptionsPage(driver);
        return postOptionsPage;
    }

    public PostSharePage getPostSharePage(){
        postSharePage = new PostSharePage(driver);
        return postSharePage;
    }

    public PostLikePage getPostLikePage(){
        postLikePage = new PostLikePage(driver);
        return postLikePage;
    }

    public PostSavePage getPostSavePage(){
        postSavePage = new PostSavePage(driver);
        return postSavePage;
    }

    public FollowPage getFollowPage(){
        followPage = new FollowPage(driver);
        return followPage;
    }

    public CommentLikePage getCommentLikePage(){
        commentLikePage = new CommentLikePage(driver);
        return commentLikePage;
    }

}
