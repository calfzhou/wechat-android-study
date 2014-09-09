package com.tencent.mm.pluginsdk.e;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.os.Build.VERSION;

public final class c
{
  public static void a(Context paramContext, CharSequence paramCharSequence1, CharSequence paramCharSequence2)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new d();
      ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(paramCharSequence1, paramCharSequence2));
      return;
    }
    new e();
    ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).setText(paramCharSequence2);
  }

  public static CharSequence bj(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      new d();
      ClipData localClipData = ((android.content.ClipboardManager)paramContext.getSystemService("clipboard")).getPrimaryClip();
      if ((localClipData == null) || (localClipData.getItemCount() <= 0))
        return null;
      ClipData.Item localItem = localClipData.getItemAt(0);
      if (localItem == null)
        return null;
      return localItem.getText();
    }
    new e();
    return ((android.text.ClipboardManager)paramContext.getSystemService("clipboard")).getText();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.e.c
 * JD-Core Version:    0.6.2
 */