package com.tencent.mm.ui.bindqq;

import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.p.a;
import com.tencent.mm.ui.base.e;

final class ai
  implements MenuItem.OnMenuItemClickListener
{
  ai(VerifyQQUI paramVerifyQQUI, EditText paramEditText1, EditText paramEditText2)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    String str = this.jlr.getText().toString().trim();
    VerifyQQUI.a(this.jlq, this.jls.getText().toString().trim());
    try
    {
      VerifyQQUI.a(this.jlq, Long.parseLong(str));
      if (VerifyQQUI.b(this.jlq) < 10000L)
      {
        e.b(this.jlq.aPI(), n.bxn, n.bxl);
        return true;
      }
    }
    catch (Exception localException)
    {
      e.b(this.jlq.aPI(), n.bxn, n.bxl);
      return true;
    }
    if (VerifyQQUI.c(this.jlq).equals(""))
    {
      e.b(this.jlq.aPI(), n.bxm, n.bxl);
      return true;
    }
    this.jlq.XF();
    a locala = new a(VerifyQQUI.b(this.jlq), VerifyQQUI.c(this.jlq), "", "", "", VerifyQQUI.d(this.jlq), VerifyQQUI.e(this.jlq));
    bg.qX().d(locala);
    VerifyQQUI localVerifyQQUI = this.jlq;
    ActionBarActivity localActionBarActivity = this.jlq.aPI();
    this.jlq.getString(n.bxp);
    VerifyQQUI.a(localVerifyQQUI, e.a(localActionBarActivity, this.jlq.getString(n.bxh), true, new aj(this, locala)));
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bindqq.ai
 * JD-Core Version:    0.6.2
 */