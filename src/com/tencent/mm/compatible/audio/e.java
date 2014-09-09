package com.tencent.mm.compatible.audio;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build.VERSION;
import com.jg.JgMethodChecked;
import com.tencent.mm.compatible.c.n;
import com.tencent.mm.compatible.c.o;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.compatible.g.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class e
{
  private static boolean dJP = false;
  private static boolean dJQ = false;
  private static boolean dJR = false;
  private final AudioManager dJN;
  private int dJO = 2;
  private final Set dJS = new HashSet();

  @JgMethodChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
  public e(Context paramContext)
  {
    this.dJN = ((AudioManager)paramContext.getSystemService("audio"));
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "init dkbt %s", arrayOfObject);
    paramContext.registerReceiver(new f(this), new IntentFilter("com.htc.accessory.action.CONNECTION_EXISTING"));
    paramContext.registerReceiver(new g(this), new IntentFilter("android.bluetooth.device.action.ACL_CONNECTED"));
    paramContext.registerReceiver(new h(this), new IntentFilter("android.bluetooth.device.action.ACL_DISCONNECTED"));
    if (com.tencent.mm.compatible.g.j.cp(11))
      paramContext.registerReceiver(new i(this), new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"));
  }

  @TargetApi(14)
  public static boolean mu()
  {
    int i = 1;
    boolean bool1;
    try
    {
      if (Build.VERSION.SDK_INT >= 14)
      {
        if (BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1) != 2)
          break label60;
        return i;
      }
      if (!dJP)
        if (v.dNG.dMF == i)
        {
          boolean bool2 = BluetoothAdapter.getDefaultAdapter().isEnabled();
          return bool2;
        }
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt exception in isConnectDevice()");
      bool1 = false;
    }
    return bool1;
    label60: return false;
  }

  private boolean mw()
  {
    return this.dJN.getMode() == 0;
  }

  public final boolean K(boolean paramBoolean)
  {
    return e(paramBoolean, false);
  }

  public final void a(j paramj)
  {
    if (paramj != null)
      this.dJS.add(paramj);
  }

  public final boolean a(boolean paramBoolean, int paramInt)
  {
    int i = this.dJN.getStreamMaxVolume(paramInt);
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "maxVolumn:" + i);
    int j = i / 3;
    int k = this.dJN.getStreamVolume(paramInt);
    if (k < j)
      this.dJN.setStreamVolume(paramInt, j, 0);
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "StreamType:" + paramInt + "  current:" + k);
    return e(paramBoolean, true);
  }

  public final void b(j paramj)
  {
    if (paramj != null)
      this.dJS.remove(paramj);
  }

  public final void ca(int paramInt)
  {
    Iterator localIterator = this.dJS.iterator();
    while (localIterator.hasNext())
      ((j)localIterator.next()).bY(paramInt);
  }

  public final void cb(int paramInt)
  {
    if (this.dJN != null)
      this.dJN.adjustStreamVolume(paramInt, 1, 5);
  }

  public final void cc(int paramInt)
  {
    if (this.dJN != null)
      this.dJN.adjustStreamVolume(paramInt, -1, 5);
  }

  public final int d(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((v.dNG.dMF == 1) && (paramBoolean2));
    while (true)
    {
      return 0;
      if (paramBoolean1);
      for (int i = 3; !this.dJN.isBluetoothScoOn(); i = 0)
        return i;
    }
  }

  @TargetApi(11)
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 3;
    int j = 1;
    int k = this.dJN.getMode();
    Object[] arrayOfObject1 = new Object[i];
    arrayOfObject1[0] = Boolean.valueOf(mw());
    arrayOfObject1[j] = Boolean.valueOf(paramBoolean1);
    arrayOfObject1[2] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt shiftSpeaker:%b -> %b  %s", arrayOfObject1);
    if (bi.ta())
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = Integer.valueOf(k);
      arrayOfObject3[j] = Integer.valueOf(this.dJO);
      z.v("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "shiftSpeaker return when calling Mode:%d blue:%d", arrayOfObject3);
      paramBoolean1 = false;
    }
    label506: label766: 
    do
    {
      do
      {
        while (true)
        {
          return paramBoolean1;
          if ((this.dJO == j) && (!paramBoolean2))
          {
            if ((v.dNG.dMF == j) && (paramBoolean2))
              this.dJN.setBluetoothScoOn(j);
            while (true)
            {
              return false;
              this.dJN.setMode(0);
            }
          }
          if ((paramBoolean2) && (this.dJO == j) && (dJP))
          {
            if ((v.dNG.dMF == j) && (paramBoolean2))
              this.dJN.setBluetoothScoOn(j);
            while (true)
            {
              return false;
              this.dJN.setMode(0);
            }
          }
          if ((v.dNG.dMF == j) && (paramBoolean2))
          {
            setSpeakerphoneOn(paramBoolean1);
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = Integer.valueOf(k);
            arrayOfObject2[j] = Boolean.valueOf(paramBoolean1);
            z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "doShiftSpeaker htc device mode:%d beSpeakerphoneOn:%b", arrayOfObject2);
            return j;
          }
          if (this.dJN != null)
          {
            int i13 = this.dJN.getMode();
            boolean bool6 = this.dJN.isSpeakerphoneOn();
            Object localObject1 = o.mT().cf(98305);
            Object localObject2 = o.mT().cf(94209);
            if (localObject1 == null)
            {
              o.mT().set(98305, Boolean.valueOf(bool6));
              z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "storeAudioConfig spearkeron " + bool6);
            }
            if (localObject2 == null)
            {
              o.mT().set(94209, Integer.valueOf(i13));
              z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "storeAudioConfig inmode " + i13);
            }
          }
          if (!paramBoolean2)
            break label778;
          if (!v.dNC.dLc)
            break label1030;
          com.tencent.mm.compatible.c.a locala3 = v.dNC;
          if (((locala3.dLe >= 0) && (locala3.dLf < 0)) || ((locala3.dLe < 0) && (locala3.dLf >= 0)) || (locala3.dLg > 0))
          {
            int i4 = j;
            if (i4 == 0)
              break;
            if (v.dNC.dLe < 0)
              break label506;
            setMode(v.dNC.dLe);
          }
          while (true)
          {
            if (v.dNC.dLg <= 0)
              break label533;
            setSpeakerphoneOn(paramBoolean1);
            return paramBoolean1;
            int i5 = 0;
            break;
            if (v.dNC.dLf >= 0)
              if (paramBoolean1)
                setMode(0);
              else
                setMode(2);
          }
        }
        boolean bool1;
        if (v.dNC.mL())
        {
          if (paramBoolean1)
          {
            com.tencent.mm.compatible.c.a locala5 = v.dNC;
            boolean bool5 = locala5.mL();
            int i9 = 0;
            int i10;
            StringBuilder localStringBuilder4;
            if (bool5)
            {
              i10 = 0x10 & locala5.dLh;
              localStringBuilder4 = new StringBuilder("enableSpeaker ");
              if (i10 <= 0)
                break label659;
            }
            int i12;
            for (int i11 = j; ; i12 = 0)
            {
              z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", i11);
              i9 = 0;
              if (i10 > 0)
                i9 = j;
              if (i9 != 0)
                setSpeakerphoneOn(j);
              if (v.dNC.mN() < 0)
                break;
              setMode(v.dNC.mN());
              return paramBoolean1;
            }
          }
          com.tencent.mm.compatible.c.a locala4 = v.dNC;
          if (locala4.mL())
          {
            int i6 = 0x1 & locala4.dLh;
            StringBuilder localStringBuilder3 = new StringBuilder("disableSpeaker ");
            if (i6 > 0)
            {
              int i7 = j;
              z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", i7);
              if (i6 <= 0)
                break label766;
            }
          }
          while (true)
          {
            if (j != 0)
              setSpeakerphoneOn(false);
            if (v.dNC.mO() < 0)
              break;
            setMode(v.dNC.mO());
            return paramBoolean1;
            int i8 = 0;
            break label708;
            bool1 = false;
            continue;
            bool1 = false;
          }
          if ((v.dNC.dLc) && (v.dNC.mM()))
          {
            if (paramBoolean1)
            {
              com.tencent.mm.compatible.c.a locala2 = v.dNC;
              boolean bool3 = locala2.mM();
              int i2 = 0;
              int i3;
              StringBuilder localStringBuilder2;
              if (bool3)
              {
                i3 = 0x10 & locala2.dLi;
                localStringBuilder2 = new StringBuilder("enableSpeaker ");
                if (i3 <= 0)
                  break label911;
              }
              for (boolean bool4 = bool1; ; bool4 = false)
              {
                z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", bool4);
                i2 = 0;
                if (i3 > 0)
                  i2 = bool1;
                if (i2 != 0)
                  setSpeakerphoneOn(bool1);
                if (v.dNC.mP() < 0)
                  break;
                setMode(v.dNC.mP());
                return paramBoolean1;
              }
            }
            com.tencent.mm.compatible.c.a locala1 = v.dNC;
            boolean bool2;
            if (locala1.mM())
            {
              int i1 = 0x1 & locala1.dLi;
              StringBuilder localStringBuilder1 = new StringBuilder("disableSpeaker ");
              if (i1 > 0)
              {
                bool2 = bool1;
                z.d("!24@mc8vTY0SOcpXUKRYIpcCoA==", bool2);
                if (i1 <= 0)
                  break label1018;
              }
            }
            while (true)
            {
              if (bool1)
                setSpeakerphoneOn(false);
              if (v.dNC.mQ() < 0)
                break;
              setMode(v.dNC.mQ());
              return paramBoolean1;
              bool2 = false;
              break label960;
              bool1 = false;
              continue;
              bool1 = false;
            }
          }
        }
        if (!paramBoolean2)
          break;
        if (paramBoolean1)
        {
          int m = Build.VERSION.SDK_INT;
          int n = 0;
          if (m < 11);
          while (true)
          {
            if (v.dNC.dLB >= 0)
              n = v.dNC.dLB;
            z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "voip doShiftSpeaker useSpeakerMode:" + n);
            if (n != this.dJN.getMode())
              setMode(n);
            if (this.dJN.isSpeakerphoneOn())
              break;
            setSpeakerphoneOn(bool1);
            return paramBoolean1;
            n = i;
          }
        }
        if (Build.VERSION.SDK_INT < 11)
          i = 2;
        if ((Build.VERSION.SDK_INT >= 11) && (q.nT()) && (2 == v.dNG.dMG))
          i = 2;
        if (v.dNC.dLC >= 0)
          i = v.dNC.dLC;
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "voip doShiftSpeaker usePhoneMode:" + i);
        if (i != this.dJN.getMode())
          setMode(i);
      }
      while (!this.dJN.isSpeakerphoneOn());
      setSpeakerphoneOn(false);
      return paramBoolean1;
      setSpeakerphoneOn(paramBoolean1);
    }
    while (mw() == paramBoolean1);
    label533: label708: label1018: if (paramBoolean1)
    {
      setMode(0);
      return paramBoolean1;
    }
    label659: label960: if ((Build.VERSION.SDK_INT >= 11) && (q.nT()) && (2 != v.dNG.dMG))
    {
      setMode(i);
      return paramBoolean1;
    }
    label778: label911: setMode(2);
    label1030: return paramBoolean1;
  }

  public final int getMode()
  {
    return this.dJN.getMode();
  }

  public final boolean isSpeakerphoneOn()
  {
    return this.dJN.isSpeakerphoneOn();
  }

  public final void mA()
  {
    Object localObject2;
    if (this.dJN != null)
    {
      Object localObject1 = o.mT().cf(98305);
      localObject2 = o.mT().cf(94209);
      if (localObject1 != null)
      {
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "resumeAudioConfig spearkeron: " + localObject1);
        setSpeakerphoneOn(((Boolean)localObject1).booleanValue());
        o.mT().set(98305, null);
      }
      if (localObject2 == null);
    }
    try
    {
      z.i("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "resumeAudioConfig oinmode: " + localObject2 + ",inmode:0");
      int j = Integer.parseInt(String.valueOf(localObject2));
      i = j;
      if ((i >= -1) && (i < 4))
      {
        setMode(i);
        o.mT().set(94209, null);
        return;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = 0;
        continue;
        setMode(0);
      }
    }
  }

  public final void mn()
  {
    e(true, false);
  }

  public final void mo()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt bluetoothStartSucc %s", arrayOfObject);
    if (this.dJO != 1)
    {
      this.dJO = 1;
      ca(this.dJO);
    }
  }

  public final void mp()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt buletoothStopped %s", arrayOfObject);
    if (this.dJO != 2)
    {
      this.dJO = 2;
      ca(this.dJO);
    }
  }

  public final int mq()
  {
    int i = 1;
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt isBluetoothCanUse existing:" + dJQ + " , isUseHTCAccessory = " + dJR);
    int j;
    if ((dJQ) && (!dJR))
      j = 0;
    while (j == 0)
    {
      i = -1;
      return i;
      z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt isConnectDevice:" + dJP);
      if (!mu())
      {
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt isConnectDevice =  " + dJP + " , isConnectDevice() = " + mu());
        j = 0;
      }
      else
      {
        BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (localBluetoothAdapter == null)
        {
          z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt BluetoothAdapter.getDefaultAdapter() == null");
          j = 0;
        }
        else if (!localBluetoothAdapter.isEnabled())
        {
          z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt !adp.isEnabled()");
          j = 0;
        }
        else
        {
          Set localSet = localBluetoothAdapter.getBondedDevices();
          if ((localSet == null) || (localSet.size() == 0))
          {
            z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt setDev == null || setDev.size() == 0");
            j = 0;
          }
          else
          {
            Iterator localIterator = localSet.iterator();
            do
              if (!localIterator.hasNext())
                break;
            while (((BluetoothDevice)localIterator.next()).getBondState() != 12);
          }
        }
      }
    }
    int m;
    for (int k = i; ; m = 0)
    {
      if (k == 0)
      {
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt hasBond == false");
        j = 0;
        break;
      }
      j = i;
      break;
      Object[] arrayOfObject1 = new Object[i];
      arrayOfObject1[0] = mv();
      z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt begin tryStartBluetooth %s", arrayOfObject1);
      AudioManager localAudioManager = this.dJN;
      boolean bool;
      if (com.tencent.mm.compatible.g.j.cq(8))
        bool = false;
      while (true)
      {
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = mv();
        arrayOfObject2[i] = Boolean.valueOf(bool);
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt end tryStartBluetooth %s ret:%s", arrayOfObject2);
        z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt  tryStartBluetooth " + mv() + " ret:" + bool);
        if (this.dJN.isBluetoothScoOn())
          break;
        return 0;
        if (!localAudioManager.isBluetoothScoAvailableOffCall())
        {
          bool = false;
        }
        else if (bi.ta())
        {
          bool = false;
        }
        else
        {
          if ((v.dNG.dMw == i) || (v.dNG.dMw == -1))
            localAudioManager.startBluetoothSco();
          if ((v.dNG.dMx == i) || (v.dNG.dMw == -1))
            localAudioManager.setBluetoothScoOn(i);
          bool = i;
        }
      }
    }
  }

  public final void mr()
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt begin stopBluetooth %s", arrayOfObject1);
    com.tencent.mm.compatible.b.a.a(this.dJN);
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = mv();
    z.d("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "dkbt end stopBluetooth %s", arrayOfObject2);
  }

  public final boolean ms()
  {
    return this.dJN.isBluetoothScoOn();
  }

  public final String mv()
  {
    return "mode:" + this.dJN.getMode() + " isSpeakerphoneOn:" + this.dJN.isSpeakerphoneOn() + " isBluetoothOn:" + this.dJN.isBluetoothScoOn() + " btStatus:" + this.dJO;
  }

  public final boolean mx()
  {
    if (this.dJN != null)
      return this.dJN.isWiredHeadsetOn();
    return false;
  }

  public final void my()
  {
    if (this.dJN != null)
      this.dJN.setStreamMute(3, true);
  }

  public final void mz()
  {
    if (this.dJN != null)
      this.dJN.setStreamMute(3, false);
  }

  public final void setMode(int paramInt)
  {
    if (this.dJN != null)
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.dJN.getMode());
      arrayOfObject[1] = Integer.valueOf(paramInt);
      z.i("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "set mode from %d to %d", arrayOfObject);
      this.dJN.setMode(paramInt);
    }
  }

  public final void setSpeakerphoneOn(boolean paramBoolean)
  {
    if (this.dJN != null)
    {
      z.i("!32@/B4Tb64lLpLjA0AEL11ABtNa4dj7akx6", "setSpeakerphoneOn on: " + paramBoolean);
      this.dJN.setSpeakerphoneOn(paramBoolean);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.e
 * JD-Core Version:    0.6.2
 */