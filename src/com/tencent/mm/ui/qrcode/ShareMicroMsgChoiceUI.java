package com.tencent.mm.ui.qrcode;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.aq.a;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.cl;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class ShareMicroMsgChoiceUI extends MMPreference
{
  private o dXi;

  protected final void DP()
  {
    oP(n.cel);
    this.dXi = aTL();
    a(new e(this));
    ((IconPreference)this.dXi.BU("share_micromsg_to_sina")).setIconDrawable(a.n(this, h.aaF));
    bg.qW().oY().zX("@t.qq.com");
    int i;
    IconPreference localIconPreference1;
    if (ch.a((Integer)bg.qW().oQ().get(9)) != 0)
    {
      i = 1;
      localIconPreference1 = (IconPreference)this.dXi.BU("share_micromsg_qzone");
      if (i != 0)
        break label155;
      this.dXi.b(localIconPreference1);
    }
    IconPreference localIconPreference2;
    while (true)
    {
      localIconPreference2 = (IconPreference)this.dXi.BU("share_micromsg_to_fuckbook");
      if (!x.qa())
        break label169;
      localIconPreference2.setIconDrawable(a.n(this, h.aaD));
      return;
      i = 0;
      break;
      label155: localIconPreference1.setIconDrawable(a.n(this, h.aal));
    }
    label169: this.dXi.b(localIconPreference2);
  }

  protected final boolean DY()
  {
    return false;
  }

  public final int DZ()
  {
    return q.cAe;
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (str.equals("share_micromsg_qzone"))
      if (ch.a((Integer)bg.qW().oQ().get(9)) != 0)
      {
        Intent localIntent3 = new Intent(this, ShowQRCodeStep1UI.class);
        localIntent3.putExtra("show_to", 2);
        startActivity(localIntent3);
      }
    while (true)
    {
      return false;
      com.tencent.mm.ui.base.e.b(this, n.cdU, n.buo);
      continue;
      if (str.equals("share_micromsg_to_sina"))
      {
        Intent localIntent1 = new Intent(this, ShowQRCodeStep1UI.class);
        localIntent1.putExtra("show_to", 3);
        startActivity(localIntent1);
      }
      else if (str.equals("share_micromsg_to_fuckbook"))
      {
        Intent localIntent2 = new Intent(this, ShowQRCodeStep1UI.class);
        localIntent2.putExtra("show_to", 4);
        startActivity(localIntent2);
      }
    }
  }

  public final int getLayoutId()
  {
    return k.bnn;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.qrcode.ShareMicroMsgChoiceUI
 * JD-Core Version:    0.6.2
 */