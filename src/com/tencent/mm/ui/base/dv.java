package com.tencent.mm.ui.base;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.z;

final class dv
  implements View.OnClickListener
{
  dv(MMTagPanel paramMMTagPanel)
  {
  }

  public final void onClick(View paramView)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(MMTagPanel.f(this.jcy));
    z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on panel click, enableEditMode %B", arrayOfObject);
    if (MMTagPanel.f(this.jcy))
    {
      this.jcy.aSO();
      MMTagPanel.a(this.jcy).requestFocus();
      MMTagPanel.a(this.jcy).setSelection(MMTagPanel.a(this.jcy).getText().length());
      ((InputMethodManager)this.jcy.getContext().getSystemService("input_method")).showSoftInput(MMTagPanel.a(this.jcy), 0);
      z.d("!32@/B4Tb64lLpL4fhNdmBV+Mf4yaXXb52KA", "on content click");
      if (MMTagPanel.e(this.jcy) != null)
        MMTagPanel.e(this.jcy).RQ();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.dv
 * JD-Core Version:    0.6.2
 */