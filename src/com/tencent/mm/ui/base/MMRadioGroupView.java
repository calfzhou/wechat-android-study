package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;

public class MMRadioGroupView extends LinearLayout
{
  private dc jbA = new cy(this);
  private cz jbB;
  private da jbC = new da(this, (byte)0);
  private MMRadioImageButton jbD;
  private db jbE;
  private int jby = -1;
  private int jbz = -1;

  public MMRadioGroupView(Context paramContext)
  {
    this(paramContext, null);
  }

  public MMRadioGroupView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnHierarchyChangeListener(this.jbC);
  }

  private void pE(int paramInt)
  {
    this.jby = paramInt;
    if (this.jbB != null)
      this.jbB.a(this, this.jby);
  }

  private void v(int paramInt, boolean paramBoolean)
  {
    View localView = findViewById(paramInt);
    if ((localView != null) && ((localView instanceof MMRadioImageButton)))
      ((MMRadioImageButton)localView).setChecked(paramBoolean);
  }

  public final void a(cz paramcz)
  {
    this.jbB = paramcz;
  }

  public final void a(db paramdb)
  {
    this.jbE = paramdb;
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramView instanceof MMRadioImageButton))
    {
      MMRadioImageButton localMMRadioImageButton = (MMRadioImageButton)paramView;
      if (localMMRadioImageButton.isChecked())
      {
        if (this.jby != -1)
          v(this.jby, false);
        pE(localMMRadioImageButton.getId());
        this.jbD = localMMRadioImageButton;
      }
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }

  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (this.jby != -1)
    {
      v(this.jby, true);
      pE(this.jby);
    }
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (((paramInt1 > 0) || (paramInt2 > 0)) && (this.jbE != null))
      this.jbE.nk(paramInt1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioGroupView
 * JD-Core Version:    0.6.2
 */