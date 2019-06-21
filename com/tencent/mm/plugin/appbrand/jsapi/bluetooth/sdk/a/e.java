package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

public abstract interface e
{
  public abstract void onCharacteristicChanged(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic);

  public abstract void onCharacteristicRead(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt);

  public abstract void onCharacteristicWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattCharacteristic paramBluetoothGattCharacteristic, int paramInt);

  public abstract void onConnectionStateChange(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);

  public abstract void onDescriptorRead(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt);

  public abstract void onDescriptorWrite(BluetoothGatt paramBluetoothGatt, BluetoothGattDescriptor paramBluetoothGattDescriptor, int paramInt);

  public abstract void onMtuChanged(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);

  public abstract void onReadRemoteRssi(BluetoothGatt paramBluetoothGatt, int paramInt1, int paramInt2);

  public abstract void onReliableWriteCompleted(BluetoothGatt paramBluetoothGatt, int paramInt);

  public abstract void onServicesDiscovered(BluetoothGatt paramBluetoothGatt, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.a.e
 * JD-Core Version:    0.6.2
 */