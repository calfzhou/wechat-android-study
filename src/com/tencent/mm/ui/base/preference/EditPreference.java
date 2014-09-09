package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.EditText;
import com.tencent.mm.aq.a;
import com.tencent.mm.g;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.e;

public class EditPreference extends Preference
{
  private aa fav;
  private n jgE;
  private EditText jgF;
  private ai jgy;
  private String value;

  public EditPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EditPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(ai paramai)
  {
    this.jgy = paramai;
  }

  public final void a(n paramn)
  {
    this.jgE = paramn;
  }

  public final String getValue()
  {
    return this.value;
  }

  public final void setValue(String paramString)
  {
    this.value = paramString;
  }

  public final void showDialog()
  {
    EditText localEditText;
    if (this.jgF != null)
      localEditText = this.jgF;
    while (true)
    {
      ViewGroup.LayoutParams localLayoutParams = localEditText.getLayoutParams();
      if ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))
      {
        ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localLayoutParams;
        int i = localEditText.getResources().getDimensionPixelSize(g.PA);
        localMarginLayoutParams.leftMargin = i;
        localMarginLayoutParams.rightMargin = i;
        localMarginLayoutParams.topMargin = i;
        localMarginLayoutParams.bottomMargin = i;
      }
      if (localEditText.getParent() != null)
        ((ViewGroup)localEditText.getParent()).removeView(localEditText);
      this.fav = e.a(getContext(), getTitle().toString(), localEditText, a.p(getContext(), com.tencent.mm.n.btQ), a.p(getContext(), com.tencent.mm.n.bsK), new l(this, localEditText), new m(this));
      return;
      localEditText = new EditText(getContext());
      localEditText.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      localEditText.setSingleLine(true);
      localEditText.setText(this.value);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.EditPreference
 * JD-Core Version:    0.6.2
 */