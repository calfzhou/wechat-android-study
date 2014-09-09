package com.tencent.mm.ui.chatting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.mm.ui.video.VideoDownloadUI;

final class ga
  implements DialogInterface.OnClickListener
{
  ga(fu paramfu, long paramLong, String paramString, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    fu.a(this.jqQ, this.fFG, this.jqS);
    if (this.jqT)
    {
      Intent localIntent = new Intent(fu.a(this.jqQ).agh(), VideoDownloadUI.class);
      localIntent.putExtra("file_name", this.jqS);
      fu.a(this.jqQ).startActivity(localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ga
 * JD-Core Version:    0.6.2
 */