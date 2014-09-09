package com.tencent.mm.ui.contact;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.chatting.ChattingUI;

final class cu
  implements AdapterView.OnItemClickListener
{
  cu(GroupCardSelectUI paramGroupCardSelectUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    i locali = (i)GroupCardSelectUI.a(this.jAe).getItem(paramInt);
    if (locali == null)
    {
      z.v("!44@/B4Tb64lLpKSz7OttbgzNc1GdsToXDwkLPcahtAkCew=", "onItemClick contact null");
      return;
    }
    if (GroupCardSelectUI.b(this.jAe))
    {
      if (GroupCardSelectUI.c(this.jAe))
      {
        Intent localIntent2 = new Intent();
        localIntent2.putExtra("Select_Conv_User", locali.getUsername());
        this.jAe.setResult(-1, localIntent2);
        this.jAe.finish();
        return;
      }
      Intent localIntent3 = new Intent(this.jAe, ChattingUI.class);
      localIntent3.addFlags(67108864);
      localIntent3.putExtra("Chat_User", locali.getUsername());
      this.jAe.startActivity(localIntent3);
      this.jAe.finish();
      return;
    }
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("Select_Contact", ch.a(bg.qW().oZ().xV(locali.getUsername()), ","));
    localIntent1.putExtra("Select_room_name", y.dh(locali.getUsername()));
    this.jAe.setResult(-1, localIntent1);
    this.jAe.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.cu
 * JD-Core Version:    0.6.2
 */