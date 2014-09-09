package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.storage.ar;
import java.util.ArrayList;

final class i
  implements AdapterView.OnItemClickListener
{
  i(AppAttachFileListUI paramAppAttachFileListUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Intent localIntent = new Intent(this.jlM, AppAttachDownloadUI.class);
    localIntent.putExtra("app_msg_id", ((m)AppAttachFileListUI.a(this.jlM).get(paramInt)).cMM.kk());
    localIntent.setFlags(67108864);
    this.jlM.startActivity(localIntent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.i
 * JD-Core Version:    0.6.2
 */