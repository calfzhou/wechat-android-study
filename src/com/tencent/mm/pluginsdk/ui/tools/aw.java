package com.tencent.mm.pluginsdk.ui.tools;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.mm.ui.widget.c;

public final class aw
  implements TextWatcher
{
  private c hMa = null;

  public final void a(c paramc)
  {
    this.hMa = paramc;
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (this.hMa != null)
      this.hMa.afm();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.aw
 * JD-Core Version:    0.6.2
 */