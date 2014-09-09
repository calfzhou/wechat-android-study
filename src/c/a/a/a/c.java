package c.a.a.a;

import c.a.d.i;

public class c extends b
{
  public String bfv()
  {
    return "http://api.twitter.com/oauth/request_token";
  }

  public String bfw()
  {
    return "http://api.twitter.com/oauth/access_token";
  }

  public final String c(i parami)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = parami.atX();
    return String.format("https://api.twitter.com/oauth/authorize?oauth_token=%s", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     c.a.a.a.c
 * JD-Core Version:    0.6.2
 */