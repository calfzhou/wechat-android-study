package com.tencent.mm.ui.base;

import android.content.Context;
import android.text.ClipboardManager;
import android.util.AttributeSet;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.ch;

public class PasterEditText extends EditText
{
  private Context context;
  private ClipboardManager gGR = null;
  private int gGS = 0;

  public PasterEditText(Context paramContext)
  {
    super(paramContext);
    this.context = paramContext;
    init();
  }

  public PasterEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.context = paramContext;
    init();
  }

  private void init()
  {
    this.gGR = ((ClipboardManager)this.context.getSystemService("clipboard"));
  }

  public final int aow()
  {
    return this.gGS;
  }

  public boolean onTextContextMenuItem(int paramInt)
  {
    if (paramInt == 16908322)
    {
      if ((this.gGR != null) && (this.gGR.getText() != null) && ((this.gGR.getText() instanceof String)) && (!ch.jb((String)this.gGR.getText())))
      {
        this.gGS += this.gGR.getText().length();
        return true;
      }
    }
    else
      return super.onTextContextMenuItem(paramInt);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.PasterEditText
 * JD-Core Version:    0.6.2
 */