#!groovy

def call(Map params) {
    return checkout([
        $class: 'GitSCM',
        branches: [[name: params.branch]],
        userRemoteConfigs: [[url: params.url]]
    ])
}