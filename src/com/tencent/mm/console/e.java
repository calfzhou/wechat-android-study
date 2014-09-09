package com.tencent.mm.console;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.ClipboardManager;
import android.widget.Toast;
import com.tencent.mm.n;

final class e
  implements DialogInterface.OnClickListener
{
  e(Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((ClipboardManager)this.dPo.getSystemService("clipboard")).setText(this.dPp);
    Toast.makeText(this.dPo, n.coH, 0).show();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.e
 * JD-Core Version:    0.6.2
 */