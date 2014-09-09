package com.tencent.mm.ui.setting;

import android.content.Intent;
import com.tencent.mm.n;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.qrcode.ShowQRCodeStep1UI;

final class r
  implements y
{
  r(SelfQRCodeUI paramSelfQRCodeUI, String[] paramArrayOfString)
  {
  }

  public final void onClick(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.jzW.length));
    while (true)
    {
      return;
      int i = -1;
      if (this.jzW[paramInt].equals(this.jLL.getString(n.aal)))
        i = 2;
      while (i > 0)
      {
        Intent localIntent = new Intent(this.jLL, ShowQRCodeStep1UI.class);
        localIntent.putExtra("show_to", i);
        this.jLL.startActivity(localIntent);
        return;
        if (this.jzW[paramInt].equals(this.jLL.getString(n.cdY)))
          i = 3;
        else if (this.jzW[paramInt].equals(this.jLL.getString(n.cdW)))
          i = 4;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.r
 * JD-Core Version:    0.6.2
 */