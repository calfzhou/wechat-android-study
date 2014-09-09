package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.mm.pluginsdk.ui.applet.aq;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.chatting.oj;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class fh extends oj
{
  private int eOZ = 0;
  private String jUq;
  private String jUr;
  private List jwh;

  public fh(Context paramContext)
  {
    super(paramContext, null);
  }

  private void a(String paramString, int paramInt, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    switch (paramInt)
    {
    default:
      return;
    case 25:
      a(paramString, paramOnDismissListener);
      return;
    case 24:
    }
    b(paramString, paramOnDismissListener);
  }

  public static boolean a(Context paramContext, String paramString, DialogInterface.OnDismissListener paramOnDismissListener)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while ((!paramString.endsWith("@mailto@")) && (!paramString.endsWith("@tel@")))
      return false;
    fh localfh = new fh(paramContext);
    if ((paramString == null) || (paramString.length() == 0));
    while (true)
    {
      return true;
      if (paramString.endsWith("@mailto@"))
        localfh.a(paramString.substring(0, -8 + paramString.length()), 24, paramOnDismissListener);
      else if (paramString.endsWith("@tel@"))
        localfh.a(paramString.substring(0, -5 + paramString.length()), 25, paramOnDismissListener);
    }
  }

  public static boolean aw(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    while ((!paramString.endsWith("@mailto@")) && (!paramString.endsWith("@tel@")))
      return false;
    return true;
  }

  private String e(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)) || (paramInt1 >= paramInt2))
      return paramString1;
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      localStringBuilder.append(paramString1.subSequence(0, paramInt1 + this.eOZ));
      localStringBuilder.append(paramString2);
      localStringBuilder.append(paramString1.subSequence(paramInt2 + this.eOZ, paramString1.length()));
      this.eOZ += paramString2.length() - (paramInt2 - paramInt1);
      String str = localStringBuilder.toString();
      return str;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIFT6/haL4Qr0KBZ6prinU0", localException.getMessage());
    }
    return "";
  }

  public final String ub(String paramString)
  {
    this.jUq = paramString;
    this.jUr = paramString;
    this.jwh = T(paramString, true);
    if (this.jwh.size() == 0)
      return this.jUr;
    Collections.sort(this.jwh, new fi(this));
    Iterator localIterator = this.jwh.iterator();
    if (localIterator.hasNext())
    {
      aq localaq = (aq)localIterator.next();
      int i = localaq.dBS;
      int j = localaq.dBT;
      int k = localaq.type;
      String str1 = null;
      label140: String str2;
      Object[] arrayOfObject2;
      switch (k)
      {
      default:
        if (str1 != null)
        {
          str2 = localaq.hBU;
          if ((localaq.type != 1) || (str2.startsWith("http://")))
            break label271;
          arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = ("http://" + str2.trim());
          arrayOfObject2[1] = str2.trim();
        }
        break;
      case 25:
      case 24:
      case 1:
      }
      label271: Object[] arrayOfObject1;
      for (String str3 = String.format(str1, arrayOfObject2); ; str3 = String.format(str1, arrayOfObject1))
      {
        this.jUq = e(this.jUq, i, j, str3);
        if (this.jUq.length() != 0)
          break;
        return this.jUr;
        str1 = "<a href=\"%s@tel@\">%s</a>";
        break label140;
        str1 = "<a href=\"%s@mailto@\">%s</a>";
        break label140;
        str1 = "<a href=\"%s\">%s</a>";
        break label140;
        break;
        arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = str2.trim();
        arrayOfObject1[1] = str2.trim();
      }
    }
    return this.jUq;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fh
 * JD-Core Version:    0.6.2
 */