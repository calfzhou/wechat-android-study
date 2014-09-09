package com.tencent.mm.ui.gallery;

import android.content.Intent;
import com.tencent.mm.ui.base.y;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class d
  implements y
{
  d(c paramc)
  {
  }

  public final void onClick(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    GestureGalleryUI localGestureGalleryUI;
    String str;
    do
    {
      return;
      GestureGalleryUI.a(this.jJJ.jJI, GestureGalleryUI.b(this.jJJ.jJI));
      return;
      localGestureGalleryUI = this.jJJ.jJI;
      str = GestureGalleryUI.b(this.jJJ.jJI);
    }
    while ((str == null) || (str.length() == 0));
    Intent localIntent = new Intent(localGestureGalleryUI, MsgRetransmitUI.class);
    localIntent.putExtra("Retr_File_Name", str);
    localIntent.putExtra("Retr_Msg_Type", 0);
    localIntent.putExtra("Retr_Compress_Type", 0);
    localGestureGalleryUI.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gallery.d
 * JD-Core Version:    0.6.2
 */