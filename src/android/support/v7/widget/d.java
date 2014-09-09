package android.support.v7.widget;

import android.text.Editable;
import android.text.TextWatcher;

final class d
  implements TextWatcher
{
  d(SearchView paramSearchView)
  {
  }

  public final void afterTextChanged(Editable paramEditable)
  {
  }

  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    SearchView.a(this.JW, paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.widget.d
 * JD-Core Version:    0.6.2
 */