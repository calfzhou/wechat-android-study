package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.LinkedList;

final class ex
  implements DialogInterface.OnClickListener
{
  ex(SelectContactUI paramSelectContactUI, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SelectContactUI.a(this.jBX, this.euZ);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ex
 * JD-Core Version:    0.6.2
 */