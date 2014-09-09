package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.f.c;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;

public final class cg
{
  private static aa jHl = null;

  public static void aYx()
  {
    if (jHl != null)
    {
      jHl.dismiss();
      jHl = null;
    }
  }

  public static void cv(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    int i = localSharedPreferences.getInt("show_rating_flag", 0);
    int j = localSharedPreferences.getInt("show_rating_version", 0);
    long l1 = localSharedPreferences.getLong("show_rating_timestamp", 0L);
    boolean bool = localSharedPreferences.getBoolean("show_rating_again", false);
    String str = com.tencent.mm.f.e.or().getValue("ShowRating");
    if (ap.jb(str))
      str = "0";
    int k = Integer.decode(str).intValue();
    int m;
    long l2;
    if (j == 0)
    {
      m = 0;
      if (k > 0)
        m = 1;
      if (m == 0)
        break label432;
      localSharedPreferences.edit().putInt("show_rating_version", k).commit();
      localSharedPreferences.edit().putInt("show_rating_flag", 0).commit();
      l2 = System.currentTimeMillis();
      localSharedPreferences.edit().putLong("show_rating_timestamp", l2).commit();
      localSharedPreferences.edit().putBoolean("show_rating_again", false).commit();
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(j);
      arrayOfObject[1] = Integer.valueOf(k);
      z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]clientVersion=%s,dynamic config showRatting version=%s", arrayOfObject);
    }
    while (true)
    {
      if ((k > 0) && (k == a.hrn) && (i == 0) && (l2 != 0L) && (System.currentTimeMillis() >= 604800000L + l2))
      {
        z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]show enjoy app dialog.");
        jHl = com.tencent.mm.ui.base.e.a(paramContext, false, paramContext.getString(n.cjD), "", paramContext.getString(n.cjw), paramContext.getString(n.cjv), new ch(localSharedPreferences, paramContext), new ci(localSharedPreferences, paramContext));
      }
      do
      {
        return;
        m = 0;
        if (j == k)
          break;
        m = 0;
        if (k <= 0)
          break;
        m = 1;
        break;
        if ((bool) && (l2 != 0L) && (System.currentTimeMillis() >= 345600000L + (l2 + 604800000L)))
        {
          z.d("!56@/B4Tb64lLpKfk9dhVjv2t13FMeWGyuWHyNH8f+koYe5udsWe+5WrMg==", "[oneliang]show rating dialog again.");
          d(paramContext, false);
          localSharedPreferences.edit().putInt("show_rating_flag", 3).commit();
          return;
        }
        if (i == 1)
        {
          d(paramContext, true);
          return;
        }
        if (i == 2)
        {
          cw(paramContext);
          return;
        }
      }
      while (i != 3);
      d(paramContext, false);
      return;
      label432: l2 = l1;
    }
  }

  private static void cw(Context paramContext)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    jHl = com.tencent.mm.ui.base.e.a(paramContext, false, paramContext.getString(n.cjG), "", paramContext.getString(n.cjF), paramContext.getString(n.cjE), new cl(localSharedPreferences, paramContext), new cm(localSharedPreferences));
  }

  private static void d(Context paramContext, boolean paramBoolean)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("show_rating_preferences", 0);
    boolean bool = localSharedPreferences.getBoolean("show_rating_again", false);
    String str1;
    String str2;
    if (paramBoolean)
    {
      str1 = paramContext.getString(n.cjC);
      str2 = paramContext.getString(n.cjB);
    }
    for (String str3 = paramContext.getString(n.cjA); ; str3 = paramContext.getString(n.cjx))
    {
      jHl = com.tencent.mm.ui.base.e.a(paramContext, false, str1, "", str2, str3, new cj(localSharedPreferences, paramContext, bool), new ck(localSharedPreferences, bool));
      return;
      str1 = paramContext.getString(n.cjz);
      str2 = paramContext.getString(n.cjy);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.cg
 * JD-Core Version:    0.6.2
 */