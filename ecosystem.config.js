
module.exports = {
  apps: [{
    name: 'cmdscape',
    script: './index.js'
  }],
  deploy: {
    production: {
      user: 'ubuntu',
      host: 'ec2-18-224-43-8.us-east-2.compute.amazonaws.com',
      key: '~/.ssh/personal.pem',
      ref: 'origin/master',
      repo: 'git@github.com:theblackathena/cmdscape.git',
      path: '/home/ubuntu/personal/cmdscape',
      'post-deploy': 'npm install && pm2 startOrRestart ecosystem.config.js'
    }
  }
}
