package com.tencent.mm.pluginsdk.ui;

final class o
  implements Runnable
{
  o(EmojiView paramEmojiView)
  {
  }

  public final void run()
  {
    if (EmojiView.FH())
    {
      EmojiView.a(this.hym);
      this.hym.invalidate();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.o
 * JD-Core Version:    0.6.2
 */