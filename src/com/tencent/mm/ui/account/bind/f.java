package com.tencent.mm.ui.account.bind;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;

final class f
  implements View.OnClickListener
{
  f(BindMobileUI paramBindMobileUI)
  {
  }

  public final void onClick(View paramView)
  {
    if ((BindMobileUI.a(this.iTO).getText().toString() == null) || (BindMobileUI.a(this.iTO).getText().toString().length() == 0))
    {
      Toast.makeText(this.iTO, this.iTO.getString(n.bwo), 0).show();
      return;
    }
    BindMobileUI.b(this.iTO, BindMobileUI.b(this.iTO).getText().toString().trim() + ch.xC(BindMobileUI.a(this.iTO).getText().toString()));
    BindMobileUI.c(this.iTO, BindMobileUI.c(this.iTO));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.bind.f
 * JD-Core Version:    0.6.2
 */