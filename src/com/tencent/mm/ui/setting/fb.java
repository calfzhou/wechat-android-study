package com.tencent.mm.ui.setting;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import com.tencent.mm.ad.j;
import com.tencent.mm.ad.l;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class fb
  implements AdapterView.OnItemClickListener
{
  fb(SettingsSelectBgUI paramSettingsSelectBgUI)
  {
  }

  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (paramInt == 0)
    {
      SettingsSelectBgUI.a(this.jOg, -2);
      SettingsSelectBgUI.b(this.jOg).DW();
      if (!SettingsSelectBgUI.c(this.jOg))
      {
        this.jOg.setResult(-1);
        this.jOg.finish();
      }
    }
    do
    {
      return;
      if (paramInt != 1)
        break;
      SettingsSelectBgUI.a(this.jOg, 0);
      SettingsSelectBgUI.b(this.jOg).DW();
    }
    while (SettingsSelectBgUI.c(this.jOg));
    this.jOg.setResult(-1);
    this.jOg.finish();
    return;
    if (!bg.qW().isSDCardAvailable())
    {
      Toast.makeText(this.jOg, n.cgR, 1).show();
      return;
    }
    l locall = (l)paramAdapterView.getItemAtPosition(paramInt - 2);
    if (locall == null)
    {
      z.e("!44@/B4Tb64lLpJkrm2DE1IrT03v4L09z6OmhNfUL88lD+0=", "onItemClick fail, info is null, position = " + paramInt);
      return;
    }
    switch (locall.getStatus())
    {
    default:
      return;
    case 1:
    case 2:
      SettingsSelectBgUI.a(this.jOg, locall.getId());
      if (SettingsSelectBgUI.c(this.jOg))
      {
        locall.setStatus(1);
        s.yO().c(locall);
      }
      break;
    case 5:
    case 3:
    case 4:
    }
    while (!SettingsSelectBgUI.c(this.jOg))
    {
      this.jOg.setResult(-1);
      this.jOg.finish();
      return;
      if (SettingsSelectBgUI.d(this.jOg) == null)
      {
        SettingsSelectBgUI.a(this.jOg, new j(locall.getId(), 1));
        bg.qX().d(SettingsSelectBgUI.d(this.jOg));
        return;
      }
      SettingsSelectBgUI.e(this.jOg).add(new j(locall.getId(), 1));
      return;
      if ((SettingsSelectBgUI.d(this.jOg) != null) && (SettingsSelectBgUI.d(this.jOg).yI() == locall.getId()))
      {
        bg.qX().c(SettingsSelectBgUI.d(this.jOg));
        s.yO().G(SettingsSelectBgUI.d(this.jOg).yI(), 1);
        SettingsSelectBgUI.a(this.jOg, SettingsSelectBgUI.e(this.jOg));
      }
      SettingsSelectBgUI.e(locall.getId(), SettingsSelectBgUI.e(this.jOg));
      m localm = s.yO();
      locall.setStatus(4);
      localm.b(locall);
      new fc(this, localm, locall.getId()).sendEmptyMessageDelayed(0, 1000L);
      return;
      s.yO().G(locall.getId(), 1);
      return;
      SettingsSelectBgUI.b(this.jOg).DW();
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.fb
 * JD-Core Version:    0.6.2
 */