package com.tencent.mm.ui.contact;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.modelfriend.i;

final class di
  implements View.OnClickListener
{
  di(ModRemarkNameUI paramModRemarkNameUI, i parami)
  {
  }

  public final void onClick(View paramView)
  {
    ModRemarkNameUI.a(this.jAS).setText(this.jzo.vw());
    ModRemarkNameUI.a(this.jAS).setSelection(ModRemarkNameUI.a(this.jAS).getText().length());
    ModRemarkNameUI.i(this.jAS).setVisibility(8);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.di
 * JD-Core Version:    0.6.2
 */