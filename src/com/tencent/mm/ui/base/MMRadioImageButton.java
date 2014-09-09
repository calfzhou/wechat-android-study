package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;

public class MMRadioImageButton extends ImageButton
  implements Checkable
{
  private boolean jbH;
  private boolean jbI = true;
  private boolean jbJ;
  private dc jbK;
  private dc jbL;

  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public MMRadioImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(dc paramdc)
  {
    this.jbL = paramdc;
  }

  public final boolean isCheckable()
  {
    return this.jbI;
  }

  public boolean isChecked()
  {
    return this.jbJ;
  }

  public boolean performClick()
  {
    toggle();
    return false;
  }

  public final void setCheckable(boolean paramBoolean)
  {
    this.jbI = paramBoolean;
  }

  public void setChecked(boolean paramBoolean)
  {
    if (this.jbJ != paramBoolean)
    {
      this.jbJ = paramBoolean;
      setSelected(this.jbJ);
      refreshDrawableState();
      if (!this.jbH);
    }
    else
    {
      return;
    }
    this.jbH = true;
    if (this.jbK != null)
    {
      dc localdc2 = this.jbK;
      localdc2.a(this);
    }
    if (this.jbL != null)
    {
      dc localdc1 = this.jbL;
      localdc1.a(this);
    }
    this.jbH = false;
  }

  public void toggle()
  {
    boolean bool;
    if (this.jbI)
      if (!isChecked())
      {
        if (this.jbJ)
          break label29;
        bool = true;
        setChecked(bool);
      }
    label29: 
    do
    {
      return;
      bool = false;
      break;
      if (this.jbK != null)
        this.jbK.b(this);
    }
    while (this.jbL == null);
    this.jbL.b(this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMRadioImageButton
 * JD-Core Version:    0.6.2
 */