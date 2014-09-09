package com.tencent.mm.ui.tools;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.ImageButton;

final class fy
  implements TextWatcher
{
  fy(SearchViewNotRealTimeHelper paramSearchViewNotRealTimeHelper)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
    if ((paramEditable == null) || (paramEditable.length() <= 0))
    {
      SearchViewNotRealTimeHelper.a(this.jUI).setVisibility(8);
      SearchViewNotRealTimeHelper.b(this.jUI).setEnabled(false);
      return;
    }
    SearchViewNotRealTimeHelper.a(this.jUI).setVisibility(0);
    SearchViewNotRealTimeHelper.b(this.jUI).setEnabled(true);
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.fy
 * JD-Core Version:    0.6.2
 */