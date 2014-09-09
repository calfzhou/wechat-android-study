package com.tencent.mm.ui.contact.profile;

import android.content.Intent;
import com.tencent.mm.aj.b;
import com.tencent.mm.aj.l;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.sdk.f.am;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

final class dg
  implements h
{
  dg(dd paramdd)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    if (paramBoolean1)
    {
      this.jEG.jEw.dnh.ae("show_btn");
      this.jEG.jEw.dnh.Bo();
      NormalUserFooterPreference.u(this.jEG.jEw);
      dd.a(this.jEG);
    }
    while (true)
    {
      if ((paramBoolean1) || (paramBoolean2))
      {
        Intent localIntent = NormalUserFooterPreference.b(this.jEG.jEw).getIntent();
        int i = localIntent.getIntExtra("search_kvstat_scene", 0);
        int j = localIntent.getIntExtra("search_kvstat_position", 0);
        if ((i > 0) && (j > 0))
        {
          n localn = n.fTF;
          Object[] arrayOfObject = new Object[3];
          arrayOfObject[0] = Integer.valueOf(i);
          arrayOfObject[1] = Integer.valueOf(6);
          arrayOfObject[2] = Integer.valueOf(j);
          localn.d(10991, arrayOfObject);
        }
      }
      return;
      if (paramBoolean2)
        l.AF().q(paramString1, 2);
      else
        z.e("!56@/B4Tb64lLpJ/VPCM+267XDNDqdlYcJ9jqOAFqXzg2QV6E2ZitroqxQ==", "canAddContact fail, maybe interrupt by IOnNeedSentVerify, username = " + paramString1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.dg
 * JD-Core Version:    0.6.2
 */