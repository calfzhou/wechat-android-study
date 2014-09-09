package oicq.wlogin_sdk.c;

public final class b
  implements Cloneable
{
  private String klt;
  private String message;
  private String title;
  private int type;

  public b()
  {
    bfl();
  }

  public final void DP(String paramString)
  {
    this.klt = paramString;
  }

  public final void bfl()
  {
    this.type = 0;
    this.title = "";
    this.message = "";
    this.klt = "";
  }

  public final Object clone()
  {
    return super.clone();
  }

  public final void setMessage(String paramString)
  {
    this.message = paramString;
  }

  public final void setTitle(String paramString)
  {
    this.title = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     oicq.wlogin_sdk.c.b
 * JD-Core Version:    0.6.2
 */