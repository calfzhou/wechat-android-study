package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.sdk.platformtools.cm;

public class EmojiBarView extends EmojiView
{
  private boolean hxP = false;
  private cm mHandler = new cm();

  public EmojiBarView(Context paramContext)
  {
    super(paramContext);
  }

  public EmojiBarView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected final boolean azS()
  {
    return true;
  }

  protected final void azT()
  {
    if (this.hxP)
      return;
    this.mHandler.postDelayed(new l(this), 10L);
  }

  protected final boolean azU()
  {
    return false;
  }

  protected final boolean azV()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.EmojiBarView
 * JD-Core Version:    0.6.2
 */