package com.tencent.mm.ui.account;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.plugin.a.b;
import com.tencent.mm.protocal.a;
import com.tencent.mm.ui.account.mobile.MobileInputUI;
import com.tencent.mm.ui.base.cm;

final class bb
  implements cm
{
  bb(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    switch (paramMenuItem.getItemId())
    {
    case 3:
    case 5:
    case 6:
    case 7:
    default:
      return;
    case 1:
      b.jE("F100_100_QQ");
      b.b(true, bg.qS() + "," + this.dLL.getClass().getName() + ",F100_100_QQ," + bg.eg("F100_100_QQ") + ",1");
      az.au(this.dLL, this.dLL.getString(n.cnj));
      return;
    case 4:
      b.jE("F100_100_phone");
      b.b(true, bg.qS() + "," + this.dLL.getClass().getName() + ",F100_100_phone," + bg.eg("F100_100_phone") + ",1");
      if (a.hrq)
      {
        Toast.makeText(this.dLL, this.dLL.getString(n.bsC), 0).show();
        return;
      }
      Intent localIntent = new Intent(this.dLL, MobileInputUI.class);
      if (this.iOw != null)
      {
        int i = this.iOw.indexOf("+");
        String str = this.iOw;
        if ((i != -1) && (this.iOw.length() > 0))
          str = this.iOw.substring(i + 1);
        localIntent.putExtra("couttry_code", str);
      }
      if (this.iOx != null)
        localIntent.putExtra("country_name", this.iOx);
      if (this.iOy != null)
        localIntent.putExtra("bindmcontact_shortmobile", this.iOy);
      localIntent.putExtra("mobile_input_purpose", 1);
      this.dLL.startActivity(localIntent);
      return;
    case 2:
      b.jE("F100_100_Email");
      b.b(true, bg.qS() + "," + this.dLL.getClass().getName() + ",F100_100_Email," + bg.eg("F100_100_Email") + ",1");
      az.au(this.dLL, this.dLL.getString(n.cni));
      return;
    case 8:
    }
    az.au(this.dLL, this.dLL.getString(n.ctM));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bb
 * JD-Core Version:    0.6.2
 */