package com.tencent.mm.ui.c.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.smtt.sdk.a;
import com.tencent.smtt.sdk.b;

public final class e
{
  protected static String jHw = "https://m.facebook.com/dialog/";
  protected static String jHx = "https://graph.facebook.com/";
  protected static String jHy = "https://api.facebook.com/restserver.php";
  private String fau;
  private long jHA = 0L;
  private Activity jHB;
  private String[] jHC;
  private int jHD;
  private g jHE;
  private final long jHF = 86400000L;
  private long jHz = 0L;
  private String jis = null;

  public e(String paramString)
  {
    this.fau = paramString;
  }

  private void a(Activity paramActivity, String[] paramArrayOfString)
  {
    Bundle localBundle = new Bundle();
    if (paramArrayOfString.length > 0)
      localBundle.putString("scope", TextUtils.join(",", paramArrayOfString));
    b.cN(paramActivity);
    a(paramActivity, "oauth", localBundle, new f(this));
  }

  public final void CW(String paramString)
  {
    this.jis = paramString;
    this.jHz = System.currentTimeMillis();
  }

  public final void CX(String paramString)
  {
    if (paramString != null)
      if (!paramString.equals("0"))
        break label21;
    label21: for (long l = 0L; ; l = System.currentTimeMillis() + 1000L * Long.parseLong(paramString))
    {
      this.jHA = l;
      return;
    }
  }

  public final String a(String paramString1, Bundle paramBundle, String paramString2)
  {
    paramBundle.putString("format", "json");
    if (aYz())
      paramBundle.putString("access_token", this.jis);
    if (paramString1 != null);
    for (String str = jHx + paramString1; ; str = jHy)
      return m.b(str, paramString2, paramBundle);
  }

  public final void a(Activity paramActivity, String[] paramArrayOfString, g paramg)
  {
    this.jHE = paramg;
    a(paramActivity, paramArrayOfString);
  }

  public final void a(Context paramContext, String paramString, Bundle paramBundle, g paramg)
  {
    String str1 = jHw + paramString;
    paramBundle.putString("display", "touch");
    paramBundle.putString("redirect_uri", "fbconnect://success");
    if (paramString.equals("oauth"))
    {
      paramBundle.putString("type", "user_agent");
      paramBundle.putString("client_id", this.fau);
    }
    String str2;
    while (true)
    {
      if (aYz())
        paramBundle.putString("access_token", this.jis);
      str2 = str1 + "?" + m.z(paramBundle);
      if (paramContext.checkCallingOrSelfPermission("android.permission.INTERNET") == 0)
        break;
      m.p(paramContext, "Error", "Application requires permission to access the Internet");
      return;
      paramBundle.putString("app_id", this.fau);
    }
    new i(paramContext, str2, paramg).show();
  }

  public final String aYA()
  {
    return this.jis;
  }

  public final long aYB()
  {
    return this.jHA;
  }

  public final boolean aYz()
  {
    return (this.jis != null) && ((this.jHA == 0L) || (System.currentTimeMillis() < this.jHA));
  }

  public final void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == this.jHD)
    {
      if (paramInt2 != -1)
        break label296;
      str1 = paramIntent.getStringExtra("error");
      if (str1 == null)
        str1 = paramIntent.getStringExtra("error_type");
      if (str1 == null)
        break label197;
      if ((!str1.equals("service_disabled")) && (!str1.equals("AndroidAuthKillSwitchException")))
        break label79;
      z.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
      a(this.jHB, this.jHC);
    }
    label79: 
    while (paramInt2 != 0)
    {
      String str1;
      return;
      if ((str1.equals("access_denied")) || (str1.equals("OAuthAccessDeniedException")))
      {
        z.d("Facebook-authorize", "Login canceled by user.");
        this.jHE.onCancel();
        return;
      }
      String str2 = paramIntent.getStringExtra("error_description");
      if (str2 != null)
        str1 = str1 + ":" + str2;
      z.d("Facebook-authorize", "Login failed: " + str1);
      this.jHE.a(new h(str1));
      return;
      CW(paramIntent.getStringExtra("access_token"));
      CX(paramIntent.getStringExtra("expires_in"));
      if (aYz())
      {
        z.d("Facebook-authorize", "Login Success! access_token=" + this.jis + " expires=" + this.jHA);
        this.jHE.a(paramIntent.getExtras());
        return;
      }
      this.jHE.a(new h("Failed to receive access token."));
      return;
    }
    label197: if (paramIntent != null)
    {
      z.d("Facebook-authorize", "Login failed: " + paramIntent.getStringExtra("error"));
      this.jHE.a(new d(paramIntent.getStringExtra("error"), paramIntent.getIntExtra("error_code", -1), paramIntent.getStringExtra("failing_url")));
      return;
    }
    label296: z.d("Facebook-authorize", "Login canceled by user.");
    this.jHE.onCancel();
  }

  public final String cz(Context paramContext)
  {
    b.cN(paramContext);
    a.bdq().removeAllCookie();
    CW(null);
    this.jHA = 0L;
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.e
 * JD-Core Version:    0.6.2
 */