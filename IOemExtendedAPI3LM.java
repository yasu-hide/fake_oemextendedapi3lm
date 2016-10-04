package android.os;

import static android.R.attr.label;

public abstract interface IOemExtendedApi3LM extends IInterface {
    public abstract void clear() throws RemoteException;

    public abstract int getEmergencyLockState() throws RemoteException;

    public abstract int getFelicaState() throws RemoteException;

    public abstract int getInfraredState() throws RemoteException;

    public abstract int getOneSegState() throws RemoteException;

    public abstract int getVersion() throws RemoteException;

    public abstract boolean setEmergencyLock(boolean paramBoolean1, String paramString, boolean paramBoolean2) throws RemoteException;

    public abstract void setEmergencyLockState(int paramInt) throws RemoteException;

    public abstract void setFelicaState(int paramInt) throws RemoteException;

    public abstract void setInfraredState(int paramInt) throws RemoteException;

    public abstract void setOneSegState(int paramInt) throws RemoteException;

    public abstract void setisSimulatorPermitted(boolean paramBoolean) throws RemoteException;

    public static abstract class Stub extends Binder implements IOemExtendedApi3LM {
        private static final String DESCRIPTOR = "android.os.IOemExtendedApi3LM";
        static final int TRANSACTION_clear = 2;
        static final int TRANSACTION_getEmergencyLockState = 10;
        static final int TRANSACTION_getFelicaState = 4;
        static final int TRANSACTION_getInfraredState = 8;
        static final int TRANSACTION_getOneSegState = 6;
        static final int TRANSACTION_getVersion = 1;
        static final int TRANSACTION_setEmergencyLock = 12;
        static final int TRANSACTION_setEmergencyLockState = 11;
        static final int TRANSACTION_setFelicaState = 5;
        static final int TRANSACTION_setInfraredState = 9;
        static final int TRANSACTION_setOneSegState = 7;
        static final int TRANSACTION_setisSimulatorPermitted = 3;

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IOemExtendedApi3LM asInterface(IBinder paramIBinder) {
            return new Proxy(paramIBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) throws RemoteException {
            switch (paramInt1) {
                default:
                    return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
                case 1598968902:
                    paramParcel2.writeString(DESCRIPTOR);
                    return true;
                case TRANSACTION_getVersion:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    paramInt1 = getVersion();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    return true;
                case TRANSACTION_clear:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    clear();
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_setisSimulatorPermitted:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    setisSimulatorPermitted(true);
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_getFelicaState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    paramInt1 = getFelicaState();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    return true;
                case TRANSACTION_setFelicaState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    setFelicaState(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_getOneSegState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    paramInt1 = getOneSegState();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    return true;
                case TRANSACTION_setOneSegState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    setOneSegState(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_getInfraredState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    paramInt1 = getInfraredState();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    return true;
                case TRANSACTION_setInfraredState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    setInfraredState(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_getEmergencyLockState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    paramInt1 = getEmergencyLockState();
                    paramParcel2.writeNoException();
                    paramParcel2.writeInt(paramInt1);
                    return true;
                case TRANSACTION_setEmergencyLockState:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    setEmergencyLockState(paramParcel1.readInt());
                    paramParcel2.writeNoException();
                    return true;
                case TRANSACTION_setEmergencyLock:
                    paramParcel1.enforceInterface(DESCRIPTOR);
                    boolean bool1 = setEmergencyLock(true, paramParcel1.readString(), true);
                    paramParcel2.writeNoException();
                    paramInt1 = 0;
                    paramParcel2.writeInt(paramInt1);
                    return true;
            }
        }

        private static class Proxy implements IOemExtendedApi3LM {
            private IBinder mRemote;
            Proxy(IBinder paramIBinder) {
                this.mRemote = paramIBinder;
            }
            public IBinder asBinder() {
                return this.mRemote;
            }
            public void clear() throws RemoteException {
                return;
            }
            public int getEmergencyLockState() throws RemoteException {
                return 1;
            }
            public int getFelicaState() throws RemoteException {
                return 1;
            }
            public int getInfraredState() throws RemoteException {
                return 1;
            }
            public String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }
            public int getOneSegState() throws RemoteException {
                return 1;
            }
            public int getVersion() throws RemoteException {
                return 0;
            }
            public boolean setEmergencyLock(boolean paramBoolean1, String paramString, boolean paramBoolean2) throws RemoteException {
                return true;
            }
            public void setEmergencyLockState(int paramInt) throws RemoteException {
                return;
            }
            public void setFelicaState(int paramInt) throws RemoteException {
                return;
            }
            public void setInfraredState(int paramInt) throws RemoteException {
                return;
            }
            public void setOneSegState(int paramInt) throws RemoteException {
                return;
            }
            public void setisSimulatorPermitted(boolean paramBoolean) throws RemoteException {
                return;
            }
        }
    }
}

