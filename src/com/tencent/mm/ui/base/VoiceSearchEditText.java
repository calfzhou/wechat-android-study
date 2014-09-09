package com.tencent.mm.ui.base;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.tencent.mm.h;

public class VoiceSearchEditText extends EditText
{
  private Context context;
  private View.OnClickListener fqU;
  public String iYA = "";
  final Drawable jgd = getResources().getDrawable(h.acU);
  final Drawable jge = null;
  final Drawable jgf = getResources().getDrawable(h.aaf);
  private gj jgg;
  private boolean jgh = true;
  private boolean jgi = false;
  private boolean jgj = false;

  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }

  public VoiceSearchEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }

  private void init(Context paramContext)
  {
    this.context = paramContext;
    this.jgi = false;
    this.jgd.setBounds(0, 0, this.jgd.getIntrinsicWidth(), this.jgd.getIntrinsicHeight());
    this.jgf.setBounds(0, 0, this.jgf.getIntrinsicWidth(), this.jgf.getIntrinsicHeight());
    this.jgh = true;
    if (this.jgi)
    {
      setCompoundDrawables(this.jge, getCompoundDrawables()[1], this.jgd, getCompoundDrawables()[3]);
      setOnTouchListener(new gg(this));
      addTextChangedListener(new gh(this));
      setOnFocusChangeListener(new gi(this));
      if ((paramContext instanceof Activity))
      {
        View localView = ((Activity)paramContext).getCurrentFocus();
        if ((localView == null) || (localView != this))
          break label227;
      }
    }
    label227: for (this.jgj = true; ; this.jgj = false)
    {
      requestFocus();
      return;
      if (getText().toString().length() > 0)
      {
        setCompoundDrawables(this.jge, getCompoundDrawables()[1], this.jgf, getCompoundDrawables()[3]);
        break;
      }
      setCompoundDrawables(this.jge, getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.VoiceSearchEditText
 * JD-Core Version:    0.6.2
 */