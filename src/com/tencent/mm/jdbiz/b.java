package com.tencent.mm.jdbiz;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class b
  implements DialogInterface.OnClickListener
{
  b(JDRemindDialog paramJDRemindDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.dQs.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jdbiz.b
 * JD-Core Version:    0.6.2
 */