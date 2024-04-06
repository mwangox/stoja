package com.mwangox.stoja;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: stoo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class KVServiceGrpc {

  private KVServiceGrpc() {}

  public static final String SERVICE_NAME = "KVService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetRequest,
      com.mwangox.stoja.Stoo.GetResponse> getGetServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetService",
      requestType = com.mwangox.stoja.Stoo.GetRequest.class,
      responseType = com.mwangox.stoja.Stoo.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetRequest,
      com.mwangox.stoja.Stoo.GetResponse> getGetServiceMethod() {
    io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetRequest, com.mwangox.stoja.Stoo.GetResponse> getGetServiceMethod;
    if ((getGetServiceMethod = KVServiceGrpc.getGetServiceMethod) == null) {
      synchronized (KVServiceGrpc.class) {
        if ((getGetServiceMethod = KVServiceGrpc.getGetServiceMethod) == null) {
          KVServiceGrpc.getGetServiceMethod = getGetServiceMethod =
              io.grpc.MethodDescriptor.<com.mwangox.stoja.Stoo.GetRequest, com.mwangox.stoja.Stoo.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVServiceMethodDescriptorSupplier("GetService"))
              .build();
        }
      }
    }
    return getGetServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest,
      com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> getGetServiceByNamespaceAndProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetServiceByNamespaceAndProfile",
      requestType = com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest.class,
      responseType = com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest,
      com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> getGetServiceByNamespaceAndProfileMethod() {
    io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest, com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> getGetServiceByNamespaceAndProfileMethod;
    if ((getGetServiceByNamespaceAndProfileMethod = KVServiceGrpc.getGetServiceByNamespaceAndProfileMethod) == null) {
      synchronized (KVServiceGrpc.class) {
        if ((getGetServiceByNamespaceAndProfileMethod = KVServiceGrpc.getGetServiceByNamespaceAndProfileMethod) == null) {
          KVServiceGrpc.getGetServiceByNamespaceAndProfileMethod = getGetServiceByNamespaceAndProfileMethod =
              io.grpc.MethodDescriptor.<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest, com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetServiceByNamespaceAndProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVServiceMethodDescriptorSupplier("GetServiceByNamespaceAndProfile"))
              .build();
        }
      }
    }
    return getGetServiceByNamespaceAndProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.SetKeyRequest,
      com.mwangox.stoja.Stoo.SetKeyResponse> getSetKeyServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetKeyService",
      requestType = com.mwangox.stoja.Stoo.SetKeyRequest.class,
      responseType = com.mwangox.stoja.Stoo.SetKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.SetKeyRequest,
      com.mwangox.stoja.Stoo.SetKeyResponse> getSetKeyServiceMethod() {
    io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.SetKeyRequest, com.mwangox.stoja.Stoo.SetKeyResponse> getSetKeyServiceMethod;
    if ((getSetKeyServiceMethod = KVServiceGrpc.getSetKeyServiceMethod) == null) {
      synchronized (KVServiceGrpc.class) {
        if ((getSetKeyServiceMethod = KVServiceGrpc.getSetKeyServiceMethod) == null) {
          KVServiceGrpc.getSetKeyServiceMethod = getSetKeyServiceMethod =
              io.grpc.MethodDescriptor.<com.mwangox.stoja.Stoo.SetKeyRequest, com.mwangox.stoja.Stoo.SetKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetKeyService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.SetKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.SetKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVServiceMethodDescriptorSupplier("SetKeyService"))
              .build();
        }
      }
    }
    return getSetKeyServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.DeleteKeyRequest,
      com.mwangox.stoja.Stoo.DeleteKeyResponse> getDeleteKeyServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteKeyService",
      requestType = com.mwangox.stoja.Stoo.DeleteKeyRequest.class,
      responseType = com.mwangox.stoja.Stoo.DeleteKeyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.DeleteKeyRequest,
      com.mwangox.stoja.Stoo.DeleteKeyResponse> getDeleteKeyServiceMethod() {
    io.grpc.MethodDescriptor<com.mwangox.stoja.Stoo.DeleteKeyRequest, com.mwangox.stoja.Stoo.DeleteKeyResponse> getDeleteKeyServiceMethod;
    if ((getDeleteKeyServiceMethod = KVServiceGrpc.getDeleteKeyServiceMethod) == null) {
      synchronized (KVServiceGrpc.class) {
        if ((getDeleteKeyServiceMethod = KVServiceGrpc.getDeleteKeyServiceMethod) == null) {
          KVServiceGrpc.getDeleteKeyServiceMethod = getDeleteKeyServiceMethod =
              io.grpc.MethodDescriptor.<com.mwangox.stoja.Stoo.DeleteKeyRequest, com.mwangox.stoja.Stoo.DeleteKeyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteKeyService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.DeleteKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mwangox.stoja.Stoo.DeleteKeyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KVServiceMethodDescriptorSupplier("DeleteKeyService"))
              .build();
        }
      }
    }
    return getDeleteKeyServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KVServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServiceStub>() {
        @java.lang.Override
        public KVServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServiceStub(channel, callOptions);
        }
      };
    return KVServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KVServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServiceBlockingStub>() {
        @java.lang.Override
        public KVServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServiceBlockingStub(channel, callOptions);
        }
      };
    return KVServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KVServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KVServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KVServiceFutureStub>() {
        @java.lang.Override
        public KVServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KVServiceFutureStub(channel, callOptions);
        }
      };
    return KVServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KVServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Get a key
     * </pre>
     */
    public void getService(com.mwangox.stoja.Stoo.GetRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Get keys by namespace and profile
     * </pre>
     */
    public void getServiceByNamespaceAndProfile(com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetServiceByNamespaceAndProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     *Set a key
     * </pre>
     */
    public void setKeyService(com.mwangox.stoja.Stoo.SetKeyRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.SetKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetKeyServiceMethod(), responseObserver);
    }

    /**
     * <pre>
     *Delete a key
     * </pre>
     */
    public void deleteKeyService(com.mwangox.stoja.Stoo.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteKeyServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mwangox.stoja.Stoo.GetRequest,
                com.mwangox.stoja.Stoo.GetResponse>(
                  this, METHODID_GET_SERVICE)))
          .addMethod(
            getGetServiceByNamespaceAndProfileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest,
                com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse>(
                  this, METHODID_GET_SERVICE_BY_NAMESPACE_AND_PROFILE)))
          .addMethod(
            getSetKeyServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mwangox.stoja.Stoo.SetKeyRequest,
                com.mwangox.stoja.Stoo.SetKeyResponse>(
                  this, METHODID_SET_KEY_SERVICE)))
          .addMethod(
            getDeleteKeyServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mwangox.stoja.Stoo.DeleteKeyRequest,
                com.mwangox.stoja.Stoo.DeleteKeyResponse>(
                  this, METHODID_DELETE_KEY_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class KVServiceStub extends io.grpc.stub.AbstractAsyncStub<KVServiceStub> {
    private KVServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get a key
     * </pre>
     */
    public void getService(com.mwangox.stoja.Stoo.GetRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Get keys by namespace and profile
     * </pre>
     */
    public void getServiceByNamespaceAndProfile(com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetServiceByNamespaceAndProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Set a key
     * </pre>
     */
    public void setKeyService(com.mwangox.stoja.Stoo.SetKeyRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.SetKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetKeyServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *Delete a key
     * </pre>
     */
    public void deleteKeyService(com.mwangox.stoja.Stoo.DeleteKeyRequest request,
        io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.DeleteKeyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteKeyServiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KVServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KVServiceBlockingStub> {
    private KVServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get a key
     * </pre>
     */
    public com.mwangox.stoja.Stoo.GetResponse getService(com.mwangox.stoja.Stoo.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Get keys by namespace and profile
     * </pre>
     */
    public com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse getServiceByNamespaceAndProfile(com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetServiceByNamespaceAndProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Set a key
     * </pre>
     */
    public com.mwangox.stoja.Stoo.SetKeyResponse setKeyService(com.mwangox.stoja.Stoo.SetKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetKeyServiceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *Delete a key
     * </pre>
     */
    public com.mwangox.stoja.Stoo.DeleteKeyResponse deleteKeyService(com.mwangox.stoja.Stoo.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteKeyServiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KVServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KVServiceFutureStub> {
    private KVServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KVServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KVServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *Get a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mwangox.stoja.Stoo.GetResponse> getService(
        com.mwangox.stoja.Stoo.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Get keys by namespace and profile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse> getServiceByNamespaceAndProfile(
        com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetServiceByNamespaceAndProfileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Set a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mwangox.stoja.Stoo.SetKeyResponse> setKeyService(
        com.mwangox.stoja.Stoo.SetKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetKeyServiceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *Delete a key
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mwangox.stoja.Stoo.DeleteKeyResponse> deleteKeyService(
        com.mwangox.stoja.Stoo.DeleteKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteKeyServiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVICE = 0;
  private static final int METHODID_GET_SERVICE_BY_NAMESPACE_AND_PROFILE = 1;
  private static final int METHODID_SET_KEY_SERVICE = 2;
  private static final int METHODID_DELETE_KEY_SERVICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KVServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KVServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVICE:
          serviceImpl.getService((com.mwangox.stoja.Stoo.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetResponse>) responseObserver);
          break;
        case METHODID_GET_SERVICE_BY_NAMESPACE_AND_PROFILE:
          serviceImpl.getServiceByNamespaceAndProfile((com.mwangox.stoja.Stoo.GetByNamespaceAndProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.GetByNamespaceAndProfileResponse>) responseObserver);
          break;
        case METHODID_SET_KEY_SERVICE:
          serviceImpl.setKeyService((com.mwangox.stoja.Stoo.SetKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.SetKeyResponse>) responseObserver);
          break;
        case METHODID_DELETE_KEY_SERVICE:
          serviceImpl.deleteKeyService((com.mwangox.stoja.Stoo.DeleteKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.mwangox.stoja.Stoo.DeleteKeyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KVServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mwangox.stoja.Stoo.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KVService");
    }
  }

  private static final class KVServiceFileDescriptorSupplier
      extends KVServiceBaseDescriptorSupplier {
    KVServiceFileDescriptorSupplier() {}
  }

  private static final class KVServiceMethodDescriptorSupplier
      extends KVServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KVServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KVServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KVServiceFileDescriptorSupplier())
              .addMethod(getGetServiceMethod())
              .addMethod(getGetServiceByNamespaceAndProfileMethod())
              .addMethod(getSetKeyServiceMethod())
              .addMethod(getDeleteKeyServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
