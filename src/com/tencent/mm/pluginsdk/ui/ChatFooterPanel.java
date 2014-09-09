package com.tencent.mm.pluginsdk.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.mm.pluginsdk.ui.chat.au;

public abstract class ChatFooterPanel extends LinearLayout
{
  protected int hxA;
  protected h hxy;
  protected au hxz;

  public ChatFooterPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void a(au paramau)
  {
    this.hxz = paramau;
  }

  public final void a(h paramh)
  {
    this.hxy = paramh;
  }

  public abstract void azM();

  public abstract void azN();

  public abstract void azO();

  public abstract void de(boolean paramBoolean);

  public void destroy()
  {
  }

  public final void mq(int paramInt)
  {
    this.hxA = paramInt;
  }

  public abstract void onPause();

  public abstract void onResume();

  public abstract void reset();

  public abstract void s(boolean paramBoolean1, boolean paramBoolean2);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.ChatFooterPanel
 * JD-Core Version:    0.6.2
 */