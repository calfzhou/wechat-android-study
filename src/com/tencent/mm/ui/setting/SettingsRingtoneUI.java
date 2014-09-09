package com.tencent.mm.ui.setting;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.mm.g;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cu;

public class SettingsRingtoneUI extends MMActivity
  implements AdapterView.OnItemClickListener, Runnable
{
  public static final String jNT = null;
  private Cursor fW;
  private RingtoneManager jNU;
  LayoutInflater jNV;
  private int jNW = -1;
  private int jNX = -1;
  private Ringtone jNY;
  private cm mHandler;

  protected final int getLayoutId()
  {
    return k.bmY;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mHandler = new cm();
    this.jNV = LayoutInflater.from(this);
    this.jNU = new RingtoneManager(this);
    this.jNU.setType(2);
    setVolumeControlStream(5);
    this.jNY = RingtoneManager.getRingtone(this, RingtoneManager.getDefaultUri(2));
    oP(n.cgf);
    a(new ep(this));
    a(0, getString(n.cfJ), new eq(this), cu.iMA);
    ListView localListView = (ListView)findViewById(i.aPo);
    View localView1 = new View(this);
    int i = getResources().getDimensionPixelSize(g.PA);
    localView1.setLayoutParams(new AbsListView.LayoutParams(-1, i));
    View localView2 = new View(this);
    localView2.setLayoutParams(new AbsListView.LayoutParams(-1, i));
    localView1.setClickable(false);
    localView2.setClickable(false);
    localListView.addHeaderView(localView1);
    localListView.addFooterView(localView2);
    this.fW = this.jNU.getCursor();
    localListView.setAdapter(new er(this, this.fW));
    localListView.setItemsCanFocus(false);
    localListView.setOnItemClickListener(this);
    String str = getSharedPreferences(ak.aHi(), 0).getString("settings.ringtone", null);
    int k;
    if (str != jNT)
    {
      Uri localUri = Uri.parse(str);
      int j = this.jNU.getRingtonePosition(localUri);
      if (j >= 0)
      {
        k = j + 2;
        this.jNW = k;
        this.jNX = (-1 + this.jNW);
      }
    }
    while (true)
    {
      localListView.setItemChecked(this.jNW, true);
      localListView.setSelection(this.jNW);
      return;
      k = 1;
      break;
      this.jNW = 1;
    }
  }

  protected void onDestroy()
  {
    if ((this.fW != null) && (!this.fW.isClosed()))
    {
      this.fW.close();
      this.fW = null;
    }
    super.onDestroy();
  }

  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.mHandler.removeCallbacks(this);
    this.jNX = (paramInt - 1);
    this.mHandler.postDelayed(this, 300L);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 24) || (paramInt == 25))
      return super.onKeyUp(paramInt, paramKeyEvent);
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onStop()
  {
    this.jNU.stopPreviousRingtone();
    super.onStop();
  }

  public void run()
  {
    Ringtone localRingtone;
    if (this.jNX == 0)
      localRingtone = this.jNY;
    while (true)
    {
      if (localRingtone != null);
      try
      {
        localRingtone.play();
        return;
        localRingtone = this.jNU.getRingtone(-1 + this.jNX);
      }
      catch (Exception localException)
      {
        z.printErrStackTrace("!32@gYUvCHi91do+WRaEASHU65WymiD826j/", localException, "play ringtone error", new Object[0]);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.SettingsRingtoneUI
 * JD-Core Version:    0.6.2
 */