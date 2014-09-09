package com.tencent.mm.ui.contact.profile;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.c.a.eq;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.e;

public final class ai extends be
  implements as
{
  public ai(Context paramContext)
  {
    super(paramContext, new ca(paramContext));
    eq localeq = new eq();
    com.tencent.mm.sdk.c.a.aGB().g(localeq);
  }

  public static void Cc()
  {
    bg.qW().oV().zw("feedsapp");
    bg.qW().oW().yC("feedsapp");
  }

  protected final int DZ()
  {
    return q.cze;
  }

  protected final boolean aXQ()
  {
    return (0x8000 & x.pO()) == 0;
  }

  protected final void clear()
  {
    Cc();
  }

  protected final void fH(boolean paramBoolean)
  {
    Context localContext = this.context;
    if (paramBoolean);
    for (String str = localContext.getString(n.cgw); ; str = localContext.getString(n.cgC))
    {
      localContext.getString(n.buo);
      new ay(new aj(paramBoolean, null, e.a(localContext, str, true, null)), false).cP(1500L);
      return;
    }
  }

  public final boolean ky(String paramString)
  {
    if ("contact_info_plugin_view".equals(paramString))
    {
      Intent localIntent1 = new Intent();
      localIntent1.putExtra("sns_timeline_NeedFirstLoadint", true);
      com.tencent.mm.am.a.b(this.context, "sns", ".ui.SnsTimeLineUI", localIntent1);
      return true;
    }
    if ("contact_info_plugin_outsize".equals(paramString))
    {
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("k_sns_tag_id", 4L);
      com.tencent.mm.am.a.b(this.context, "sns", ".ui.SnsBlackDetailUI", localIntent2);
    }
    if ("contact_info_plugin_black".equals(paramString))
    {
      Intent localIntent3 = new Intent();
      localIntent3.putExtra("k_sns_tag_id", 5L);
      com.tencent.mm.am.a.b(this.context, "sns", ".ui.SnsTagDetailUI", localIntent3);
    }
    return super.ky(paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.ai
 * JD-Core Version:    0.6.2
 */