package com.tencent.mm.ui.account.mobile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.b;

final class cn
  implements DialogInterface.OnClickListener
{
  cn(ce paramce)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    b.jE("L200_100");
    Intent localIntent = new Intent(ce.b(this.iUS), MobileInputUI.class);
    localIntent.putExtra("mobile_input_purpose", 1);
    localIntent.addFlags(67108864);
    ce.b(this.iUS).startActivity(localIntent);
    b.jF(bg.qS() + "," + getClass().getName() + ",L200_900_phone," + bg.eg("L200_900_phone") + ",2");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.cn
 * JD-Core Version:    0.6.2
 */