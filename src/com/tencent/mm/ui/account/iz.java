package com.tencent.mm.ui.account;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.widget.EditText;
import android.widget.ImageView;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.modelsimple.e;
import com.tencent.mm.sdk.platformtools.aq;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;

final class iz
  implements aq
{
  Bitmap eXV;
  String iSu;

  iz(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean rD()
  {
    try
    {
      this.iSu = e.D(this.iSh);
      this.eXV = e.E(this.iSh);
      if ((this.eXV == null) || (this.eXV.isRecycled()));
    }
    catch (Exception localException1)
    {
      try
      {
        i.a(this.eXV, 100, Bitmap.CompressFormat.PNG, h.dOS + "temp.avatar", false);
        return true;
        localException1 = localException1;
        z.e("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "getName or getBitmap err : " + localException1.getMessage());
      }
      catch (Exception localException2)
      {
        while (true)
          z.e("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "save avatar fail." + localException2.getMessage());
      }
    }
  }

  public final boolean rE()
  {
    if ((!ch.jb(this.iSu)) && (ch.jb(RegSetInfoUI.b(this.iSh).getText().trim())))
      RegSetInfoUI.b(this.iSh).setText(this.iSu);
    if (!j.nI())
    {
      z.e("!32@9DU/RFsdGl8JYFGpESyRAL2xk59FhSfi", "SDcard is not available");
      return false;
    }
    if ((this.eXV != null) && (!this.eXV.isRecycled()) && (!RegSetInfoUI.j(this.iSh)))
    {
      RegSetInfoUI.i(this.iSh).setImageBitmap(this.eXV);
      RegSetInfoUI.k(this.iSh);
      RegSetInfoUI.l(this.iSh).setVisibility(0);
    }
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.iz
 * JD-Core Version:    0.6.2
 */