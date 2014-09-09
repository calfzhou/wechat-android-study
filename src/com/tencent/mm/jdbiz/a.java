package com.tencent.mm.jdbiz;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ch;

final class a
  implements DialogInterface.OnClickListener
{
  a(JDRemindDialog paramJDRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str1 = "";
    Intent localIntent1 = this.dQs.getIntent();
    String str2 = null;
    if (localIntent1 != null)
    {
      Bundle localBundle = this.dQs.getIntent().getExtras();
      str2 = null;
      if (localBundle != null)
      {
        str2 = this.dQs.getIntent().getExtras().getString("alertjumpurl");
        str1 = this.dQs.getIntent().getExtras().getString("alert_activityid");
      }
    }
    if (str1.equals(g.Cp().Cu().dQx))
    {
      g.Cp();
      if (g.Cq())
      {
        g.Cp();
        g.Ct();
        g.Cp();
        g.Cs();
      }
    }
    if (!ch.jb(str2))
    {
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("rawUrl", str2);
      localIntent2.putExtra("useJs", true);
      localIntent2.putExtra("vertical_scroll", true);
      com.tencent.mm.am.a.b(this.dQs, "webview", ".ui.tools.WebViewUI", localIntent2);
      n localn = n.fTF;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = str2;
      arrayOfObject[1] = g.Cp().Cu().dQx;
      arrayOfObject[2] = Integer.valueOf(5);
      localn.d(11179, arrayOfObject);
    }
    this.dQs.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.a
 * JD-Core Version:    0.6.2
 */