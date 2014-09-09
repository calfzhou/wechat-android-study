package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ar.b;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.ui.base.MMClearEditText;

final class bp
  implements View.OnClickListener
{
  bp(ContactRemarkInfoModUI paramContactRemarkInfoModUI)
  {
  }

  public final void onClick(View paramView)
  {
    ContactRemarkInfoModUI.e(this.jzm);
    ContactRemarkInfoModUI.a(this.jzm, true);
    ContactRemarkInfoModUI.f(this.jzm).setText(b.f(this.jzm, ap.ja(ContactRemarkInfoModUI.x(this.jzm)), (int)ContactRemarkInfoModUI.f(this.jzm).getTextSize()));
    ContactRemarkInfoModUI.f(this.jzm).setSelection(ContactRemarkInfoModUI.f(this.jzm).getText().length());
    ContactRemarkInfoModUI.w(this.jzm).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.bp
 * JD-Core Version:    0.6.2
 */